package com.example.spring.第4章;

import com.example.spring.第2章.光盘;
import com.example.spring.第2章.空白光盘;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class 磁道计数配置 {

    @Bean
    public 光盘 光盘() {
        空白光盘 空白光盘 = new 空白光盘();
        空白光盘.set标题("标题");
        空白光盘.set歌手("歌手");

        List<String> 磁道 = new ArrayList<>();
        磁道.add("歌词1");
        磁道.add("歌词2");

        空白光盘.set磁道列表(磁道);

        return 空白光盘;
    }

    @Bean
    public 磁道计数 磁道计数() {
        return new 磁道计数();
    }
}
