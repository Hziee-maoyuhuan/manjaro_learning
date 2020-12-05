import cn.hziee.myh.config.MyConfig;
import cn.hziee.myh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // 如果完全使用配置类方式做,则只能通过AnnotationConfig方式获取容器 配置类的class加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = context.getBean("getUser", User.class);
        System.out.println(user);

        User user1 = context.getBean("user", User.class);
        System.out.println(user1);

    }
}
