package cn.hziee.myh.service;


// 实现类
public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("add User..");
    }

    @Override
    public void delete() {
        System.out.println("delete User..");
    }

    @Override
    public void update() {
        System.out.println("update User..");
    }

    @Override
    public void query() {
        System.out.println("query User..");
    }
}
