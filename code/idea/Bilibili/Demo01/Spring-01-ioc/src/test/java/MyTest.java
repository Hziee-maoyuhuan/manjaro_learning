import cn.hziee.myh.dao.*;
import cn.hziee.myh.service.UserService;
import cn.hziee.myh.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        // 用户实际调用的是service层,用户不需要接触DAO层
        UserService userService = new UserServiceImpl();
        // 通过传入的参数不一样 对应的操作也不一样 程序不需要控制对象来源 接口的思想
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServerImpl());
        userService.getUser();
    }
}
