import cn.hziee.myh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

//        使用配置文件扫描注解
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
