package com.ivymon.inventory.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivymon.inventory.model.Request;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 2)
public class LogAspect {
    private ObjectMapper objectMapper = new ObjectMapper();
    private Logger LOG = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void withinController() {
    }

    @Around("withinController() && args(req, ..)")
    public Object around(ProceedingJoinPoint joinPoint, Request<Object> req) throws Throwable {
        LOG.debug(objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(req));
        Object response = joinPoint.proceed();
        LOG.debug(objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(response));
        return response;
    }

}
