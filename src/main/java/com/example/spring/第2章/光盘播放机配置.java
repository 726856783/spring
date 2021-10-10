package com.example.spring.第2章;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.example.spring.第2章", "com.example.spring.第1章"},
        basePackageClasses = {音乐专辑.class, com.example.spring.第1章.勇敢的骑士.class})
@Import(光盘配置.class)
public class 光盘播放机配置 {

    @Bean("beanId")
    public 光盘 音乐专辑() {
        return new 音乐专辑();
    }

    @Bean
    public 光盘播放机 光盘播放机() {
        return new 光盘播放机(音乐专辑());
    }

    @Bean
    public 光盘播放机 光盘播放机2(光盘 光盘) {
        return new 光盘播放机(光盘);
    }
}
