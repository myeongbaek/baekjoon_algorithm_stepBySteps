package com.algorithm.baekjoon.ch05;

import java.io.*;
import java.util.StringTokenizer;

class ch05_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int totalSum = 0;
        String[] str = br.readLine().split("");
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(str[i]);
            totalSum += number;
        }
        bw.write("" + totalSum);
        bw.flush();
        bw.close();
    }
}
