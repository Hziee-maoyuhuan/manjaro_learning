import cn.hziee.myh.pojo.Student;
import cn.hziee.myh.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);

    }

    @Test
    public void test1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("UserBean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }

}
