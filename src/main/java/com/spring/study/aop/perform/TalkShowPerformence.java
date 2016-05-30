/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.aop.perform;

import org.springframework.stereotype.Component;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: TalkShowPerformence.java, v 0.1 May 30, 2016 4:54:16 PM wb-zhanglu.y Exp $
 */
@Component
public class TalkShowPerformence implements Performence {

    /** 
     * @see com.spring.study.aop.perform.Performence#perform()
     */
    public void perform() {
        System.out.println("*************  hi this is a talk show!!!!!");
    }

}
