package com.ivymon.inventory.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Order(value = 2)
public class LogAspect {

    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void withinController(){}

    @Pointcut("execution(* com.ivymon.inventory.controller.*.*(..))")
    public void executionController(){}

    @Autowired
    HttpServletRequest request;

    @Before("executionController()")
    public void executionbefore(JoinPoint joinPoint){
        System.out.println("executionbefore " + joinPoint.getSignature().getName());
    }

    @After("executionController()")
    public void executionafter(JoinPoint joinPoint){
        System.out.println("executionafter " + joinPoint.getSignature().getName());
    }
    @Before("withinController()")
    public void withinbefore(JoinPoint joinPoint){
        System.out.println("withinbefore " + joinPoint.getSignature().getName());
    }

    @After("withinController()")
    public void withinafter(JoinPoint joinPoint){
        System.out.println("withinafter " + joinPoint.getSignature().getName());
    }
}
