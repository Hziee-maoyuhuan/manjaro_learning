package cn.hziee.myh.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// 可以点击import中的aop查看一些方法 这里使用前置增强
public class Log implements MethodBeforeAdvice {

    // method 方法 要执行目标对象的方法 args 参数 target 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行");
    }
}
