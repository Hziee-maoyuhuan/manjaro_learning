package cn.hziee.myh.config;

import cn.hziee.myh.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyConfig.class)
@Configuration
@ComponentScan("cn.hziee.myh")
public class MyConfig2 {

    public User user(){
        return new User();
    }
}
