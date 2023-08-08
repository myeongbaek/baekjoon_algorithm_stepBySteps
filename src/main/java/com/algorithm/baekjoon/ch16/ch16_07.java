package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

class ch16_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();

        // 입력
        for(int i = 1; i <= N; i++){
            deq.offer(i);
        }

        // 연산
        while(!deq.isEmpty()){
            if(deq.size() == 1){
                break;
            }
            deq.poll();
            deq.offer(deq.poll());
        }

        // 출력
        bw.write(String.valueOf(deq.poll()));
        bw.flush();
        bw.close();
    }
}
