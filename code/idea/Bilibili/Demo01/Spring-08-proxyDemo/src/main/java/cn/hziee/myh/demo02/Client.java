package cn.hziee.myh.demo02;

// 代理类
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.add();

        // 如果需求每一个方法前增加一个功能,则需要修改原本已经写好的UserServiceImpl类


    }
}
