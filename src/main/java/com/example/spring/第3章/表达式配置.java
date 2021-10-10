package com.example.spring.第3章;

import com.example.spring.第2章.空白光盘;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/example/spring/第3章/配置.properties")
public class 表达式配置 {
    @Autowired
    Environment environment;

    @Bean
    public 空白光盘 空白光盘() {
        int 数字类型 = environment.getProperty("数字类型", Integer.class, 111);
        String 必须存在的配置 = environment.getRequiredProperty("必须存在的配置");
        return new 空白光盘(
                environment.getProperty("光盘.标题", "默认值"),
                environment.getProperty("光盘.歌手", "默认值")
        );
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
