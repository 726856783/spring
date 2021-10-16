package com.example.spring.第4章;

import org.aspectj.lang.annotation.*;

@Aspect
public class 观众定义切点 {

    @Pointcut("execution(* com.example.spring.第4章.表演.表演(..))")
    public void 表演() {

    }

    @Before("表演()")
    public void 手机静音() {
        System.out.println("手机静音");
    }

    @Before("表演()")
    public void 就座() {
        System.out.println("就座");
    }

    @AfterReturning("表演()")
    public void 鼓掌() {
        System.out.println("鼓掌");
    }

    @AfterThrowing("表演()")
    public void 要求退款() {
        System.out.println("要求退款");
    }
}
