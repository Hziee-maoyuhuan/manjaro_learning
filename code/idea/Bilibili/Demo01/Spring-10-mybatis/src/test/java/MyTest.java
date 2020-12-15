import cn.hziee.myh.mapper.UserMapper;
import cn.hziee.myh.mapper.UserMapper2Impl;
import cn.hziee.myh.mapper.UserMapperImpl;
import cn.hziee.myh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class MyTest {
    @Test
    public void test() throws ClassNotFoundException, SQLException {
//        工具类创建方式
//        String resources = "Mybatis-config.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser();
//        for (User user : userList) {
//            System.out.println(user.toString());
//        }

//        使用mybatis集成 出错
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
//        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
//        for (User user : userMapper.selectUser()) {
//            System.out.println(user);
//        }


//        集成方式2 成功
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper2Impl userMapper = context.getBean("userMapper2", UserMapper2Impl.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }


//        Connection conn = null;
//        String driver = "com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://localhost:3306/mybatis?useSSL=false";
//        String username = "root";
//        String password = "root";
//        Class.forName(driver);
//        conn = DriverManager.getConnection(url, username, password);
//        System.out.println("TestConnectionByJDBC success");
//        conn.close();

    }
}
