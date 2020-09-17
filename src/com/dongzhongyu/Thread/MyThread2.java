package com.dongzhongyu.Thread;

public class MyThread2 implements Runnable {
    private String Data = "";

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":" + i);
        }
    }
}
