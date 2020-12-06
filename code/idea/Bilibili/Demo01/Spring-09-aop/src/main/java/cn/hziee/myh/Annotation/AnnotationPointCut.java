package cn.hziee.myh.Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 使用注解方式实现AOP
@Aspect     //标注为切面类
public class AnnotationPointCut {

    //    aspectj包下的 别导错包 里面写切入点
    @Before("execution(* cn.hziee.myh.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前..");
    }

    @After("execution(* cn.hziee.myh.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后..");
    }

    @Around("execution(* cn.hziee.myh.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {      // 知道一下有ProceedingJoinPoint
        System.out.println("环绕前..");
//        Signature signature = joinPoint.getSignature();//获得签名
//        System.out.println("签名:" + signature);
        Object proceed = joinPoint.proceed();   //执行方法
//        System.out.println("proceed:" + proceed);
        System.out.println("环绕后..");
    }

}
