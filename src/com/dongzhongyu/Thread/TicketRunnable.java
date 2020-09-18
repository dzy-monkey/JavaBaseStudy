package com.dongzhongyu.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class TicketRunnable implements Runnable {
    private int count = 100;
    //所有线程拿到的锁对象，必须是同一个，如果创建出多个对象，就不能使用这种声明方式
//    private Object lock = new Object();
    //第二种加锁方式
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (count > 0) {
            lock.lock();
            try {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
                    count--;
                }
            } finally {
                lock.unlock();
            }

        }
    }

    //同步方法
    public synchronized void sellTicket() {
        //第一个线程来的时候会锁上，并拿走钥匙，第二个线程来的时候，发现被锁上了，等待
        //解决线程安全问题
//        synchronized (lock) {
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
            count--;
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
        }
        //执行完代码归还钥匙
//        }
    }
}
