package com.example.spring.第2章;

import org.springframework.stereotype.Component;

@Component("组件名")
public class 音乐专辑 implements 光盘 {
    private String 标题 = "音乐专辑标题";
    private String 歌手 = "歌手";

    @Override
    public void 播放() {
        System.out.println("正在播放：" + 标题 + " 来自：" + 歌手);
    }
}
