package com.algorithm.baekjoon.pracThread;

import java.util.ArrayList;

class MyThread1 extends Thread {
    public MyThread1(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + " : " + i);
        }
        System.out.println();
    }
}

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start.");
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            Thread t = new MyThread1("Thread" + i);
            t.start(); // 쓰레드 실행
            threads.add(t);
        }

        for (int i = 1; i < 3; i++) {
            threads.get(i).join(); // 병합지점
        }

        System.out.println("main thread end.");
    }
}
