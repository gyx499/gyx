package cn.kgc.config;

import cn.kgc.service.UserService;
import cn.kgc.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
}
