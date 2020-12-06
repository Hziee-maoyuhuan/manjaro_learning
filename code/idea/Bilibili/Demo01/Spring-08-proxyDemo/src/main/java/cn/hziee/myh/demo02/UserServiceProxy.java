package cn.hziee.myh.demo02;

// UserService代理对象 实现在不改变原有方法的情况下改变代理类进行方法增强
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    // 构造函数 不建议  Spring建议使用注入方法
    public UserServiceProxy(UserServiceImpl userService){
        this.userService = userService;
    }

    @Override
    public void add() {
        recordLog("add");
        userService.add();
    }

    @Override
    public void delete() {
        recordLog("delete");
        userService.delete();
    }

    @Override
    public void update() {
        recordLog("update");
        userService.update();
    }

    @Override
    public void query() {
        recordLog("query");
        userService.query();
    }

    public void recordLog(String message){
        System.out.println("使用了"+message+"方法");
    }
}
