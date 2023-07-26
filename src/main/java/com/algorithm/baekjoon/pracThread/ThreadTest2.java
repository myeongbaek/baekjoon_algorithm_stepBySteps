package com.algorithm.baekjoon.pracThread;

import java.util.ArrayList;

class MyThread2 implements Runnable {
    String threadName;

    public MyThread2(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.threadName + " : " + i);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start.");

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            Thread t = new Thread(new MyThread2("Thread" + i));
            t.start();
            t.join();
            threads.add(t);
        }

        System.out.println("main thread end.");

    }
}
