package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;

class ch13_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(array[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

