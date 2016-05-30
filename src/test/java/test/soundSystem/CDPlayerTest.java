/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package test.soundSystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.study.di.config.CDPlayerConfig;
import com.spring.study.di.player.CDPlayer;
import com.spring.study.di.soundSystem.CompactDisc;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: CDPlayerTest.java, v 0.1 May 26, 2016 5:07:02 PM wb-zhanglu.y
 *          Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    @Qualifier("sgt")
    private CompactDisc cd;

    @Autowired
    private CDPlayer    player;

    @Test
    public void testCdInNotNull() {
        assertNotNull(cd);
    }

    @Test
    public void testPlay() {
        this.player.play();
    }

}
