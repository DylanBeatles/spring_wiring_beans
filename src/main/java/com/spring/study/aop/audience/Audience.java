/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.aop.audience;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: Audience.java, v 0.1 May 30, 2016 4:13:44 PM wb-zhanglu.y Exp $
 */
@Aspect
@Component
public class Audience {
    @Pointcut("execution (** com.spring.study.aop.perform.Performence.perform(..))")
    public void performence() {
    }

    /**
    @Before("performence()")
    public void silenceMikePhone() {
        System.out.println("Silencing cell phones");
    }

    @Before("performence()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performence()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performence()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
     **/

    @Around("performence()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}
