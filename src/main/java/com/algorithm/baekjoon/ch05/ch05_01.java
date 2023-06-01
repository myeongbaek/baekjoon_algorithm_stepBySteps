package com.algorithm.baekjoon.ch05;

import java.io.*;

class ch05_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());
        bw.write("" + str.charAt(i - 1));
        bw.flush();
        bw.close();
    }
}
