package com.algorithm.baekjoon.ch06;

import java.io.*;

class ch06_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i < 2 * N; i++){
            if(i <= N){
                bw.write(" ".repeat(N - i));
                bw.write("*".repeat(2 * i - 1) + "\n");
            } else{
                bw.write(" ".repeat(i - N));
                bw.write("*".repeat(4 * N - 2 * i - 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
