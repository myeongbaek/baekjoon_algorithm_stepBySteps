package com.algorithm.baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();

        // 입력
        for(int i = 0; i < N; i++){
            deq.offer(Integer.parseInt(br.readLine()));
        }

        // 연산
        while(!deq.isEmpty()){

            deq.poll();
            deq.offer(deq.poll());

            if(deq.size() == 1){
                bw.write(deq.poll());
                break;
            }

        }

        // 출력
        bw.flush();
        bw.close();
    }
}
