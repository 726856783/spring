package com.example.spring.第1章;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class 骑士配置 {

    @Bean
    public 骑士 骑士() {
        return new 勇敢的骑士(探险任务());
    }

    @Bean
    public 探险任务 探险任务() {
        return new 屠龙探险任务(System.out);
    }

}
