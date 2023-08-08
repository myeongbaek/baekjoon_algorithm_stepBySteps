package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;

class ch16_08 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        // 입력
        for(int i = 1; i <= N; i++){
            list.offer(i);
        }

        // 연산
        int index = 0;
        while(!list.isEmpty()){
            index = (index + K - 1) % list.size();
            q.offer(list.remove(index));
        }

        // 출력
        bw.write("<");
        while(!q.isEmpty()){
            bw.write(String.valueOf(q.poll()));
            if(q.size() > 0){
                bw.write(", ");
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
