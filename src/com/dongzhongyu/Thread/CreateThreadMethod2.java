package com.dongzhongyu.Thread;

public class CreateThreadMethod2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        Thread t1 = new Thread(t, "线程1");
        t1.start();

        Thread t2 = new Thread(t, "线程2");
        t2.start();
        //匿名内部类
//        MyThread2 r = new MyThread2() {
//            @Override
//            public void run() {
//                for (int i=0;i<100;i++){
//                    System.out.println(Thread.currentThread().getName()+":"+i);
//                }
//            }
//        };
//        new Thread(r,"匿名内部类线程").start();
//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(Thread.currentThread().getName() + ":" + i);
//                }
//            }
//        }.start();
    }
}
