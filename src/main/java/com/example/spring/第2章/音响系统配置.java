package com.example.spring.第2章;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({光盘配置.class, 光盘播放机配置.class})
@ImportResource("classpath:光盘播放机.xml")
public class 音响系统配置 {
}
