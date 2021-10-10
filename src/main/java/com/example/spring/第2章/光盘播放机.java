package com.example.spring.第2章;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class 光盘播放机 implements 媒体播放机 {
    private 光盘 光盘;

    @Autowired(required = false)
    public 光盘播放机(光盘 光盘) {
        this.光盘 = 光盘;
    }

    @Override
    public void 播放() {
        光盘.播放();
    }

    public void set光盘(光盘 光盘) {
        this.光盘 = 光盘;
    }
}
