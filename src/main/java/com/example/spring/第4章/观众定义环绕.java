package com.example.spring.第4章;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class 观众定义环绕 {

    @Pointcut("execution(* com.example.spring.第4章.表演.表演(..))")
    public void 表演() {

    }

    @Around("表演()")
    public void 看表演(ProceedingJoinPoint proceedingJoinPoint) {
        try {

            System.out.println("手机静音");
            System.out.println("就座");

            proceedingJoinPoint.proceed();

            System.out.println("鼓掌");
        } catch (Throwable e) {

            System.out.println("要求退款");
        }
    }
}
