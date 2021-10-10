package com.example.spring.第2章;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class 光盘配置 {
    @Bean
    public 光盘 光盘() {
        return new 音乐专辑();
    }
}
