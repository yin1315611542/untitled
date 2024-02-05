package org.example.service;

import com.github.wenhao.jpa.Specifications;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@EnableCaching
@CacheConfig(cacheNames = "user-object") //如果我们在所有的@Cacheable注解中都需要设置value为user，那么就可以使用@CacheConfig来一次性完成对Cache名称的设置
public class UserService {
	
	@Autowired
    protected UserRepository userRepository;
    /*
    @CachePut 注解用于将方法的返回值存储到缓存中。每次方法被调用时，都会执行方法体，并将返回值存储到缓存中。它适用于更新缓存数据的场景
     */
    @CachePut(key = "#user.id")
    public User save(User user) {
        return userRepository.save(user);
    }

    /*
    @CacheEvict 注解用于从缓存中删除数据。它可以指定要删除的缓存名称和键，也可以通过 allEntries 参数删除所有缓存项
     */
    @CacheEvict(key = "#id")
    public void delete(Long id) {
    	userRepository.deleteById(id);
    }

    /*
        @Cacheable 注解用于从缓存中获取数据。当方法被调用时，首先会检查缓存中是否存在对应的数据，如果存在，则直接返回缓存中的数据，如果不存在，则执行方法体，并将返回值存储到缓存中。
     */
    @Cacheable(key = "#id")
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        Specification<User> specification = Specifications.<User>and().eq("valid", true).build();
        return userRepository.findAll(specification);
    }

    @Cacheable(value = "test", key = "#root.targetClass   + '_' + #p0 + '_' + #p1")
    public Page<User> findAll(int pageSize, int pageNumber) {
        Specification<User> specification = Specifications.<User>and().eq("valid", true).build();
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return userRepository.findAll(specification, pageable);
    }

}