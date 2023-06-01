package com.algorithm.baekjoon.ch07;

import java.io.*;

class ch07_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int N = 5;

    public static void main(String[] args) throws IOException {
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }
        for (int i = 0; i < array[0].length(); i++) {
            for (int j = 0; j < N; j++) {
                bw.write(array[j].charAt(i));
            }
        }
        bw.flush();
        bw.close();
    }
}
