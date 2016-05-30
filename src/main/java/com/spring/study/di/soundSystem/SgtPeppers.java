/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.di.soundSystem;

import org.springframework.stereotype.Component;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: SgtPeppers.java, v 0.1 May 26, 2016 4:46:13 PM wb-zhanglu.y Exp $
 */
@Component("sgt")
public class SgtPeppers implements CompactDisc {

    private final String title  = "Sgt. Pepper's Lonely Hearts Club Band";
    private final String artist = "The Beatles";

    /**
     * 
     * @see com.spring.study.di.soundSystem.CompactDisc#play()
     */
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
