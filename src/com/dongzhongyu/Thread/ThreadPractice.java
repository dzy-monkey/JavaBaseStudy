package com.dongzhongyu.Thread;

public class ThreadPractice {
    public static void main(String[] args) {
//        PracticeBaseClass t1 = new PracticeBaseClass("售票点1");
//        PracticeBaseClass t2 = new PracticeBaseClass("售票点2");
//        PracticeBaseClass t3 = new PracticeBaseClass("售票点3");
//        PracticeBaseClass t4 = new PracticeBaseClass("售票点4");
        TicketRunnable t =new TicketRunnable();
        Thread t1=new Thread(t,"售票点1");
        Thread t2=new Thread(t,"售票点2");
        Thread t3=new Thread(t,"售票点3");
        Thread t4=new Thread(t,"售票点4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
