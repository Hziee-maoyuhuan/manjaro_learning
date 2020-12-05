import cn.hziee.myh.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = applicationContext.getBean("person", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }


}
