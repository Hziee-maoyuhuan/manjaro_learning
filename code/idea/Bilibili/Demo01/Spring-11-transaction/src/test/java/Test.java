import cn.hziee.myh.mapper.UserMapperImpl;
import cn.hziee.myh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

    }
}
