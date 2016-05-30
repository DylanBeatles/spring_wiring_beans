/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.di.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.study.di.soundSystem.CompactDisc;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: CDPlayer.java, v 0.1 May 27, 2016 2:56:43 PM wb-zhanglu.y Exp $
 */
@Component
public class CDPlayer implements Player {
    @Autowired
    @Qualifier("sgt")
    private CompactDisc cd;

    /** 
     * @see com.spring.study.di.player.Player#play()
     */
    public void play() {
        this.cd.play();
    }

    /**
     * Getter method for property <tt>cd</tt>.
     * 
     * @return property value of cd
     */
    public CompactDisc getCd() {
        return cd;
    }

    /**
     * Setter method for property <tt>cd</tt>.
     * 
     * @param cd value to be assigned to property cd
     */
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

}
