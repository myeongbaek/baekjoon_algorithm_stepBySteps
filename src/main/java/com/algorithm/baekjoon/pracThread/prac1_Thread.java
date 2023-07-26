package com.algorithm.baekjoon.pracThread;

public class prac1_Thread extends Thread{
    int seq;
    public prac1_Thread(int seq){
        this.seq = seq;
    }
    public void run(){ // Thread를 상속하면 run 메소드를 구현해야 한다.
        System.out.println(this.seq + " thread start.");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            prac1_Thread t1 = new prac1_Thread(i);
            t1.start(); // 쓰레드 실행
        }
        System.out.println("main end.");
    }

    // 1. 쓰레드는 순서에 상관없이 동시에 실행된다.
    // 2. 쓰레드가 종료되기 전에 main 메서드가 종료된다.
}
