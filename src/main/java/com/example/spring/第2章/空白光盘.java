package com.example.spring.第2章;

import java.util.List;

public class 空白光盘 implements 光盘 {
    private String 标题;
    private String 歌手;
    private List<String> 磁道列表;

    public 空白光盘(String 标题, String 歌手) {
        this.标题 = 标题;
        this.歌手 = 歌手;
    }

    public 空白光盘(String 标题, String 歌手, List<String> 磁道列表) {
        this.标题 = 标题;
        this.歌手 = 歌手;
        this.磁道列表 = 磁道列表;
    }

    @Override
    public void 播放() {
        System.out.println("正在播放：" + 标题 + " 来自：" + 歌手);
        for (String 磁道 : 磁道列表) {
            System.out.println("磁道：" + 磁道);
        }
    }

    public void set标题(String 标题) {
        this.标题 = 标题;
    }

    public void set歌手(String 歌手) {
        this.歌手 = 歌手;
    }

    public void set磁道列表(List<String> 磁道列表) {
        this.磁道列表 = 磁道列表;
    }
}
