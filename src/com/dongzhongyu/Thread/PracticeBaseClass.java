package com.dongzhongyu.Thread;

public class PracticeBaseClass extends Thread {
    private static int count = 100;
    private static Object lock = new Object();

    public PracticeBaseClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            //线程安全的
            synchronized (lock) {
                if (count > 0) {
                    System.out.println(getName() + "卖出第" + count + "张票");
                    count--;
                } else {
                    break;
                }
            }
        }
    }
}
