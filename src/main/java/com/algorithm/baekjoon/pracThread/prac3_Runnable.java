package com.algorithm.baekjoon.pracThread;

import java.util.ArrayList;

public class prac3_Runnable implements Runnable {
    int seq;
    public prac3_Runnable(int seq){
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " thread start.");
        try{
            Thread.sleep(1000);
        } catch (Exception e){}
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Thread t = new Thread(new prac3_Runnable(i)); // Runnable 객체를 입력으로 받는다.
            t.start();
            threads.add(t);
        }

        for(int i = 0; i < 10; i++){
            Thread t = threads.get(i);
            try{
                t.join();
            } catch (Exception e){}
        }
        System.out.println("main end.");
    }

    // 1. Thread를 구현하는 경우 다른 클래스를 상속할 수 없어 제약이 생긴다.
    // 2. 그래서 보통 쓰레드 객체를 만들 때 Runnable 인터페이스를 구현하는 방식을 사용한다.
    // 3. Runnable 인터페이스는 run 메소드를 구현하도록 강제한다.

}
