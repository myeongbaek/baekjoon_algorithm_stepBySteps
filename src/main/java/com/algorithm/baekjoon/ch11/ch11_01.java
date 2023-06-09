package com.algorithm.baekjoon.ch11;

import java.io.*;

class ch11_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        bw.write("1\n0");
        bw.flush();
        bw.close();
    }
}
