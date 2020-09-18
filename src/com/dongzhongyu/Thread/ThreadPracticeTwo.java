package com.dongzhongyu.Thread;

public class ThreadPracticeTwo  {
    public static void main(String[] args) {
        Object lock =new Object();
        WindowThread windowThread =new WindowThread(lock);
        AppThread appThread = new AppThread(lock);
        new Thread(windowThread,"窗口模式").start();
        new Thread(appThread,"手机App").start();
    }
}
