package cn.hziee.myh.demo03;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {

        // 真实角色
        Host host = new Host();
        // 代理角色: 没有 需要用代理程序生成一个代理类
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理要调用的接口对象
        proxyInvocationHandler.setRent(host);
        // 返回代理类 转换为Rent 这里的代理类就是动态生成的
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        // 执行代理方法
        proxy.rent();

    }
}
