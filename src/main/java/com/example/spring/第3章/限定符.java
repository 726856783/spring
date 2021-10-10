package com.example.spring.第3章;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class 限定符 {
    private 甜点 甜点;

    @Autowired
    @Qualifier("冰激凌")
    @更详细的限定符名
    public void set甜点(甜点 甜点) {
        this.甜点 = 甜点;
    }
}
