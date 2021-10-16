package com.example.spring.第4章;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class 可插入的介绍人 {

    @DeclareParents(value = "com.example.spring.第4章.表演+",
            defaultImpl = 默认可插入.class)
    public static 可插入 可插入;
}
