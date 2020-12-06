package cn.hziee.myh.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 代理处理程序  使用这个类动态生成代理类
// 只有一个实现InvocationHandler的处理程序 没有写专门的代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成并得到代理类
    public Object getProxy() {
        // 参数分别为 当前的classLoader / 需要代理的类接口 / 当前对象this
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), ProxyInvocationHandler.this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        // 前增强
        seeHouse();
        // 动态代理的本质都是利用反射机制实现
        Object invoke = method.invoke(rent, objects);
        // 后增强
        fare();
        return invoke;
    }

    public void seeHouse() {
        System.out.println("看房");
    }

    public void fare() {
        System.out.println("收费");
    }
}
