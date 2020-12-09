package cn.hziee.myh;


/**
 * 用于标注这是一个Spring Boot项目
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
//        用于启动Application并将参数传入
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
