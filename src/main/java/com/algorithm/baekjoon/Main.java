package com.algorithm.baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Deque<Integer> deq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int order, X;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            order = Integer.parseInt(st.nextToken());
            if(order == 1){
                X = Integer.parseInt(st.nextToken());
                deq.addFirst(X);
            } else if(order == 2){
                X = Integer.parseInt(st.nextToken());
                deq.addLast(X);
            } else if(order == 3){
                if(!deq.isEmpty()){
                    bw.write(String.valueOf(deq.poll()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            } else if(order == 4){
                if(!deq.isEmpty()){
                    bw.write(String.valueOf(deq.pollLast()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            } else if(order == 5){
                bw.write(String.valueOf(deq.size()));
                bw.newLine();
            }else if(order == 6){
                bw.write(String.valueOf(deq.isEmpty()? 1: 0));
                bw.newLine();
            }else if(order == 7){
                bw.write(String.valueOf(!deq.isEmpty() ? deq.peek(): -1));
                bw.newLine();
            }else if(order == 8){
                bw.write(String.valueOf(!deq.isEmpty() ? deq.peekLast(): - 1));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
