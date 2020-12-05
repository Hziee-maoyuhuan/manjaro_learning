import cn.hziee.myh.pojo.Person;
import cn.hziee.myh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        传统创建方式
//        User user = new User();     //这里只写了一个new方法,会调用User的构造函数

//        使用Spring进行创建 确认内部是有使用创建方法 在getBean的时候已经创建
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

//        默认获取方式 使用无参构造函数
        User user = (User) applicationContext.getBean("user");
        user.show();
        System.out.println(user);

//        使用有参构造函数
        Person person0 = (Person) applicationContext.getBean("person0");
        System.out.println(person0);

        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);

        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2);

//        判定是否取出的是同一个对象
        Person anotherPerson = (Person) applicationContext.getBean("person2");
        System.out.println(person2 == anotherPerson);


//        使用别名获取对象
        User userAlias = (User) applicationContext.getBean("userAlias");
        System.out.println(userAlias == user);  // 是同一个对象
    }
}
