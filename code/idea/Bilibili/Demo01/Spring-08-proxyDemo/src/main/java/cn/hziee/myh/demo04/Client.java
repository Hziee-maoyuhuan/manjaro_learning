 package cn.hziee.myh.demo04;

import cn.hziee.myh.demo02.UserService;
import cn.hziee.myh.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        // 代理角色 (1.代理接口,也就是真实对象 2.处理类)
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);      // 设置代理角色
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();    //生成代理类 转换成UserService
        proxy.add();        //使用代理类的方法
        proxy.delete();
    }
}
