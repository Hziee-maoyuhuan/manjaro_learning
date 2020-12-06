package cn.hziee.myh.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 通用代理处理程序 使用这个类动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口 通用的对象 target
    private Object target;

    // 代理类的setter方法
    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成并得到代理类
    public Object getProxy() {
        // 参数分别为 当前的classLoader / 需要代理的类接口 / 当前对象this
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), ProxyInvocationHandler.this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        log(method.getName());      // 通过反射
        return method.invoke(target, objects);
    }

    private void log(String msg) {
        System.out.println("执行了:" + msg + "方法");
    }

}
