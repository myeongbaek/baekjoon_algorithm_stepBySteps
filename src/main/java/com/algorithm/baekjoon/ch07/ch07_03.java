package com.algorithm.baekjoon.ch07;

import java.io.*;

class ch07_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int N = 5;
    private static final int M = 15;

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j][i] != 0) {
                    bw.write((char) arr[j][i]);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
