package com.dongzhongyu.Thread;

public class ThreadGroupTest {
    public static void main(String[] args) {
        MyThread2 r = new MyThread2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        ThreadGroup tg = new ThreadGroup("我们的线程组");
        System.out.println(tg.getName());
        System.out.println(t2.getThreadGroup().getName());

        t1.start();
        t2.start();

    }

}
