package com.example.spring.第3章;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("限定符名")
@更详细的限定符名
public class 冰激凌 implements 甜点 {

    @Bean
    @Primary
    @Qualifier("限定符名")
    @更详细的限定符名
    public 甜点 冰激凌() {
        return new 冰激凌();
    }

}
