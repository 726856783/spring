package com.example.spring.第1章;

import java.io.PrintStream;

public class 屠龙探险任务 implements 探险任务 {
    private PrintStream printStream;

    public 屠龙探险任务(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void 出发() {
        printStream.println("踏上杀龙之旅");
    }
}
