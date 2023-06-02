package com.algorithm.baekjoon.ch10;

import java.io.*;

class ch10_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long N = Long.parseLong(br.readLine());
        bw.write(String.valueOf(N * 4));
        bw.flush();
        bw.close();
    }
}
