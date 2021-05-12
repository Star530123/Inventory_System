package com.ivymon.inventory.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Aspect
@Component
@Order(1)
public class TestAspect {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void withinController() {
    }

    @Pointcut("execution(* com.ivymon.inventory.controller.*.*(..))")
    public void executionController() {
    }


    @Before("executionController()")
    public void executionbefore(JoinPoint joinPoint) throws IOException {
        System.out.println("executionbefore " + joinPoint.getSignature().getName());
    }

    @After("executionController()")
    public void executionafter(JoinPoint joinPoint) throws JsonProcessingException {
        System.out.println("executionafter " + joinPoint.getSignature().getName());
    }

    @Around("executionController()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(joinPoint.getArgs()));
        Object response = joinPoint.proceed();
        System.out.println(objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(response));
        return response;
    }


    @Before("withinController()")
    public void withinbefore(JoinPoint joinPoint) {
        System.out.println("withinbefore " + joinPoint.getSignature().getName());
    }

    @After("withinController()")
    public void withinafter(JoinPoint joinPoint) {
        System.out.println("withinafter " + joinPoint.getSignature().getName());
    }
}
