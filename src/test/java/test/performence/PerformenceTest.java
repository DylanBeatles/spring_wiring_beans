/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package test.performence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.study.aop.audience.Audience;
import com.spring.study.aop.config.PerformenConfig;
import com.spring.study.aop.perform.Performence;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: PerformenceTest.java, v 0.1 May 30, 2016 4:55:41 PM wb-zhanglu.y Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformenConfig.class)
public class PerformenceTest {
    @Autowired
    private Performence performence;

    @Autowired
    private Audience    audience;

    @Test
    public void testFieldIsExist() {
        assertNotNull(performence);
        assertNotNull(audience);
    }

    @Test
    public void testPerform() {
        performence.perform();
    }
}
