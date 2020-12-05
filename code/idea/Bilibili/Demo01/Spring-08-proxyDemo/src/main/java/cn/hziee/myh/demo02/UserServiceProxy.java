package cn.hziee.myh.demo02;

// UserService代理对象
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    // 构造函数 不建议  Spring建议使用注入方法
    public UserServiceProxy(){

    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void query() {

    }
}
