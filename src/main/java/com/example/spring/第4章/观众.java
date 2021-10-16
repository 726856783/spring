package com.example.spring.第4章;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class 观众 {

    @Before("execution(* com.example.spring.第4章.表演.表演(..))")
    public void 手机静音() {
        System.out.println("手机静音");
    }

    @Before("execution(* com.example.spring.第4章.表演.表演(..))")
    public void 就座() {
        System.out.println("就座");
    }

    @AfterReturning("execution(* com.example.spring.第4章.表演.表演(..))")
    public void 鼓掌() {
        System.out.println("鼓掌");
    }

    @AfterThrowing("execution(* com.example.spring.第4章.表演.表演(..))")
    public void 要求退款() {
        System.out.println("要求退款");
    }

}
