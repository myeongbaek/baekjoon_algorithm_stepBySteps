package com.algorithm.baekjoon.ch06;

import java.io.*;
import java.util.StringTokenizer;

class ch06_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int C = Integer.parseInt(br.readLine());
        for(int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] score = new int[N];
            int totalSum = 0;
            for(int j = 0; j < N; j++){
                score[j] = Integer.parseInt(st.nextToken());
                totalSum += score[j];
            }
            float average = 1.0f * totalSum / N;
            int count = 0;
            for(int j = 0; j < N; j++){
                if (1.0f * score[j] > average){
                    count++;
                }
            }
            bw.write(String.format("%.3f%%\n", 1.0f * count / N * 100));
        }
        bw.flush();
        bw.close();
    }
}
