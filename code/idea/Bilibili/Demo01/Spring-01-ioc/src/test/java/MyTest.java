import cn.hziee.myh.dao.*;
import cn.hziee.myh.service.UserService;
import cn.hziee.myh.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

/*
        // 使用之前的方式创建对象
        // 用户实际调用的是service层,用户不需要接触DAO层
        UserService userService = new UserServiceImpl();
        // 通过传入的参数不一样 对应的操作也不一样 程序不需要控制对象来源 接口的思想
        // ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServerImpl());
        userService.getUser();
*/

        // 使用Spring的方法创建对象 不用修改程序 如果需要修改则可以直接修改配置文件(.xml)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");    //拿到Spring容器 通过配置文件
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userService.getUser();

    }
}
