package com.algorithm.baekjoon.pracThread;

import java.util.ArrayList;

public class prac2_Join extends Thread{
    int seq;
    public prac2_Join(int seq){
        this.seq = seq;
    }

    public void run(){
        System.out.println(this.seq + " thread start.");
        try{
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>(); // 생성된 쓰레드를 저장한다.
        for(int i = 0; i < 10; i++){
            Thread t = new prac2_Join(i);
            t.start();
            threads.add(t);
        }

        for(int i = 0; i < threads.size(); i++){
            Thread t = threads.get(i);
            try{
                t.join(); // join 메서드를 호출하여 쓰레드가 종료될 때까지 main 메서드가 대기한다.
            } catch (Exception e){}
        }

        System.out.println("main end.");
        // 1. 쓰레드는 순서에 상관없이 동시에 실행된다.
        // 2. join 메서드는 쓰레드 종료될 때까지 메인 쓰레드를 대기한다.
    }
}
