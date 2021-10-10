package com.example.spring.第2章;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = 光盘播放机测试.class)
public class 光盘播放机测试 {

    @Autowired
    private 光盘 光盘;

    @Autowired
    private 媒体播放机 媒体播放机;

    @Test
    public void assertNotNull() {
        Assert.assertNotNull(光盘);
    }

    @Test
    public void 播放() {
        媒体播放机.播放();
    }
}
