import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        加载配置文件 可以写多个 这里只写一个 获取Spring上下文对象 对象不由我们创建 转由Spring进行管理 需要使用则直接取
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        在XML中已经创建完毕,这里只需要直接取得即可
        System.out.println(applicationContext.getBean("hello").toString());
    }
}
