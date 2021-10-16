package com.example.spring.第7章;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class 控制器通知 {
    @ExceptionHandler(未找到异常.class)
    public String 处理异常() {
        return "异常";
    }
}
