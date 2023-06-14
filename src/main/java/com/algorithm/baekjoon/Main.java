package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static final int MAXVALUE = 10_000;

    public static void main(String[] args) throws IOException {
        //입력
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] result = new int[N];
        int[] count = new int[MAXVALUE];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            numbers[i] = n;
            count[n - 1]++; // 과정1 : counting
        }

        // count sort
        // 축척
        for(int i = 0; i < MAXVALUE - 1; i++){
            count[i + 1] += count[i];
        }
        // 누적합 - 1 위치에 배치
        for(int i = 0; i < N; i++){
            result[count[numbers[i] - 1] - 1] = numbers[i];
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int n : result) {
            sb.append(n + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

