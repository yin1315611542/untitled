import org.example.CacheApplication;
import org.example.entity.User;
import org.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = CacheApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ExtendWith(SpringExtension.class)
public class UserTest {

    @Autowired
    UserService userService;
    @Test
    public void test(){
        for (int i = 1; i <= 10000; i++) {
            User user = new User();
            user.setUserName("小"+i+i);
            user.setId(Long.parseLong(String.valueOf(i)));
            user.setValid(i%2==0);
            userService.save(user);
        }
    }
}
