package com.example.spring.第4章;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class 磁道计数 {
    private Map<Integer, Integer> 计数 = new HashMap<>();

    @Pointcut("execution(* com.example.spring.第2章.空白光盘.播放(int))" +
            "&& args(磁道数)")
    public void 磁道播放(int 磁道数) {

    }

    @Before("磁道播放(磁道数)")
    public void 磁道计数(int 磁道数) {
        int 当前计数 = 获取计数(磁道数);
        计数.put(磁道数, 当前计数 + 1);
    }

    public int 获取计数(int 磁道数) {
        return 计数.containsKey(磁道数) ? 计数.get(磁道数) : 0;
    }
}
