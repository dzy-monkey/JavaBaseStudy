package com.dongzhongyu.Thread;

public class CreateThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
//        t1.setName("线程1");
        System.out.println("ThreadT1Name:" + t1.getName());
        //不可以重复调用Start
        t1.start();
//        try {
//            //把t1线程加入到主线程中
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //线程休眠
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //把t1线程的状态改变为中断状态，但是不会直接停止线程，需要主动处理
        t1.interrupt();
        MyThread t2 = new MyThread("线程2");
        System.out.println("ThreadT2Name:" + t2.getName());
        //守护线程
//        t2.setDaemon(true);
        t2.start();



    }

    public void threadTest() {
        //        System.out.println(Thread.NORM_PRIORITY);
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.MAX_PRIORITY);
        Thread mainThread = Thread.currentThread();
        mainThread.setPriority(10);
        MyThread thread = new MyThread();
        thread.setPriority(5);
        System.out.println(mainThread.getPriority());
        System.out.println(thread.getPriority());
        //这个是错误的
//        thread.run();
        //启动线程
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("MainThread:" + i);
        }
    }
}