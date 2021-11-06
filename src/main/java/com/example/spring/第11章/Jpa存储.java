package com.example.spring.第11章;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Jpa存储 extends JpaRepository<用户, Long> {
    用户 findBy用户名(String 用户名);

    @Query("select s from 用户 s where s.用户名 like '%xx%'")
    List<用户> 自定义查询();
}
