package com.algorithm.baekjoon.pracThread;

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
        
    }
}
