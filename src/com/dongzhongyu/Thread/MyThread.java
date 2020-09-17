package com.dongzhongyu.Thread;

public class MyThread extends Thread {

    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //当前线程被设置为中断状态后，直接中断执行方法
            if (interrupted()){
                System.out.println("释放资源");
                break;
            }
            System.out.println(getName()+':' + i);
        }
    }
}
