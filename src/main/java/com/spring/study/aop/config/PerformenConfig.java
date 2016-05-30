/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: PerformenConfig.java, v 0.1 May 30, 2016 4:26:50 PM wb-zhanglu.y Exp $
 */
@Configuration
@ComponentScan(basePackages = "com.spring.study.aop")
@EnableAspectJAutoProxy
public class PerformenConfig {

}
