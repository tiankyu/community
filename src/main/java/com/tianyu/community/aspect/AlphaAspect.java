package com.tianyu.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class AlphaAspect {

    //* com.tianyu.community.service.*.*(..)的含义：（任意返回值 service包下所有的业务组件 所有的方法 所有的参数） 都要处理
    @Pointcut("execution(* com.tianyu.community.service.*.*(..))")
    public void pointcut(){

    }

    //连接点（切点）开始之前
    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }

    //连接点（切点）结束之后
    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    //连接点（切点）有返回值之后
    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //抛异常时
    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //前后都有
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around before");
        //调用目标组件的方法
        Object obj = joinPoint.proceed();
        System.out.println("around after");
        return obj;
    }
}
