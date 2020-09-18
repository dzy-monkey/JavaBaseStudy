package com.dongzhongyu.Thread;
/**
 * 死锁解决方案
 * */
public class DeadLock {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
}

class Thread1 implements Runnable {

    @Override
    public void run() {
        synchronized (DeadLock.lock1){
            System.out.println("Thread1取得第一把锁后要做的事情");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (DeadLock.lock2){
                System.out.println("Thread1同时取到两把锁之后要做的事情");
            }
        }
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        synchronized (DeadLock.lock1){
            synchronized (DeadLock.lock2){
                System.out.println("Thread2取得第二把锁之后要做的事情");
                System.out.println("Thread2同时取到两把锁之后要做的事情");
            }
        }
    }
}
