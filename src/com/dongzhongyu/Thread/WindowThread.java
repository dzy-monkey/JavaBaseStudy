package com.dongzhongyu.Thread;

public class WindowThread implements Runnable {
    public WindowThread(Object lock){
        this.lock=lock;
    }
    private Object lock;
    @Override
    public void run() {
        while (TicketMng.count > 0) {
            synchronized (lock){
                if (TicketMng.count > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出第" + TicketMng.count + "张票");
                    TicketMng.count--;
                }
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
