package cn.hziee.myh.log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    // returnValue 返回值 method 方法名 args 参数 target 目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法,返回了:"+returnValue);
    }
}
