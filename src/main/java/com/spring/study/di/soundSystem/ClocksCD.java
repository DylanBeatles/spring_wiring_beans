/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.di.soundSystem;

import org.springframework.stereotype.Component;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: ClocksCD.java, v 0.1 May 30, 2016 2:07:22 PM wb-zhanglu.y Exp $
 */
@Component("clocks")
public class ClocksCD implements CompactDisc {

    private final String title  = "Declaration Of Dependence";
    private final String artist = "Kings of Convenience";

    /**
     * 
     * @see com.spring.study.di.soundSystem.CompactDisc#play()
     */
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
