package com.algorithm.baekjoon.ch05;

import java.io.*;

class ch05_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        bw.write("" + (int)br.readLine().charAt(0));
        bw.flush();
        bw.close();
    }
}
