package com.example.spring.第3章;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class 基于方法配置 {

    @Bean(destroyMethod = "shutDown")
    @Profile("dev")
    public void 开发配置() {

    }

    @Profile("prod")
    public void 生产配置() {

    }
}
