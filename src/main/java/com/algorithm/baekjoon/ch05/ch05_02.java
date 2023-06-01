package com.algorithm.baekjoon.ch05;

import java.io.*;

class ch05_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        bw.write("" + str.length());
        bw.flush();
        bw.close();
    }
}
