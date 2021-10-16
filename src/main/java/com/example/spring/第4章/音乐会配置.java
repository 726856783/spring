package com.example.spring.第4章;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class 音乐会配置 {

    @Bean
    public 观众定义切点 观众定义切点() {
        return new 观众定义切点();
    }
}
