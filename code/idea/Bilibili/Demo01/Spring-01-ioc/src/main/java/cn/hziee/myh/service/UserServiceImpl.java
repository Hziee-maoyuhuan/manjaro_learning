package cn.hziee.myh.service;

import cn.hziee.myh.dao.UserDao;
import cn.hziee.myh.dao.UserDaoImpl;
import cn.hziee.myh.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

//    需要用到就可以使用组合拿过来
//    private UserDao userDao = new UserDaoImpl();

    //    需要改动这里才可以调用Mysql获取方式
    private UserDao userDao;

    //    调用userDao的getUser方法
    public void getUser() {
        userDao.getUser();
    }

    //    利用get和set动态实现值的获得和注入
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
