package cn.hziee.myh.config;

import cn.hziee.myh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      // 这个也会被Spring容器进行接管 注册到容器中 代表这个是配置类 和xml对标
@ComponentScan("cn.hziee.myh")
public class MyConfig {

    @Bean       // 注册一个bean就相当于之前写的bean 这个方法的名字就相当于id 返回值就相当与class
    public User getUser(){
        return  new User();     // 返回的对象
    }

}
