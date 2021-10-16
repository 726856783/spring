package com.example.spring.第7章;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "未找到")
public class 未找到异常 extends RuntimeException {
}
