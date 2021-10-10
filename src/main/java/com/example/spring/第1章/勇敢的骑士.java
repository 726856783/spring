package com.example.spring.第1章;

public class 勇敢的骑士 implements 骑士 {
    private 探险任务 探险任务;

    public 勇敢的骑士(探险任务 探险任务) {
        this.探险任务 = 探险任务;
    }

    @Override
    public void 出发探险() {
        探险任务.出发();
    }
}
