package com.example.demo.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auther: lenovo
 * @Date: 2021-03-13 17:19
 * @Description:
 */
@Aspect
@Component
public class AOPTest {


    @Pointcut("execution(public * com.example.demo.Controller..*.*(..))*")
    public void webLog(){}

    @Before("webLog()")
    public void before(){
        System.out.println("后置通知");
    }

    @After("webLog()")
    public void after(){
        System.out.println("前置通知");
    }

    @Around("webLog()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知");
        joinPoint.proceed();
    }

}
