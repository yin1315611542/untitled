package com.yinhd.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yinhd.entity.AssetType;
import com.yinhd.mapper.AssetTypeMapper;
import com.yinhd.service.AssetTypeService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资产类型 服务实现类
 * </p>
 *
 * @author yinhd
 * @since 2024-04-20 03:50:34
 */
@Service
public class AssetTypeServiceImpl extends ServiceImpl<AssetTypeMapper, AssetType> implements AssetTypeService {

    @Override
    @Cacheable(value = "assetType", key = "#id")
    public AssetType findOne(Long id) {
        return this.getOne(Wrappers.<AssetType>lambdaQuery().eq(AssetType::getId, id));
    }

    @Override
    @CachePut(value = "assetType", key = "#assetType.id")
    public AssetType saveOne(AssetType assetType) {
        this.baseMapper.insert(assetType);
        return assetType;
    }

    @Override
    @CacheEvict(value = "assetType",key = "#id")
    public Long deleteOne(Long id) {
        this.baseMapper.deleteById(id);
        return id;
    }

    @Override
    @CachePut(value = "assetType",key = "#assetType.id")
    public AssetType updateOne(AssetType assetType) {
        this.baseMapper.updateById(assetType);
        return assetType;
    }


}

