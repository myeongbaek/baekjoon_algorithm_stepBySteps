package com.algorithm.baekjoon.ch11;

import java.io.*;

class ch11_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        bw.write("" + N + "\n1");
        bw.flush();
        bw.close();
    }
}
