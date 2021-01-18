package cn.kgc;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class Springbootdemo01ApplicationTests {

    @Autowired
    private User user;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        System.out.println(user);
        userService.addUser();
    }

}
