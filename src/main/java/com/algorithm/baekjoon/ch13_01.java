package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;

class ch13_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 입력
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        // 정렬
        Arrays.sort(array);
        //출력
        for (int val : array){
            sb.append(val).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

