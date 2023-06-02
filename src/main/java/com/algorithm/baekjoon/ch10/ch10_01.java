package com.algorithm.baekjoon.ch10;

import java.io.*;

class ch10_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(A * B));
        bw.flush();
        bw.close();
    }
}
