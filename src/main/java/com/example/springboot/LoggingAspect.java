package com.example.springboot;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger logger = Logger.getLogger(LoggingAspect.class);

    @Before("execution(public String blogMain())")
    public void beforeExecutionWebAppAdvice() {
        logger.info("[log] execution shoesShopRepository.findAll()");
    }

    @After("execution(public String blogMain())")
    public void hhe() {
        logger.info("[log] execution shoesRepository.findAll()");
    }
}
