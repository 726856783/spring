package com.example.spring.第7章;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class 控制器 {

    @RequestMapping(method = RequestMethod.GET)
    public String 查询() {
        throw new 未找到异常();
    }

    @ExceptionHandler(未找到异常.class)
    public String 处理异常() {
        return "异常";
    }
}
