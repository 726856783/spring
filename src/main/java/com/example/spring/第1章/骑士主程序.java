package com.example.spring.第1章;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 骑士主程序 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("~骑士.xml");

        骑士 骑士 = classPathXmlApplicationContext.getBean(骑士.class);
        骑士.出发探险();

        classPathXmlApplicationContext.close();
    }
}
