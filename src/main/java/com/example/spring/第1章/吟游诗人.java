package com.example.spring.第1章;

import java.io.PrintStream;

public class 吟游诗人 {
    private PrintStream printStream;

    public 吟游诗人(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void 探险之前唱() {
        printStream.println("骑士很勇敢");
    }

    public void 探险之后唱() {
        printStream.println("勇敢的骑士完成了探险");
    }

}
