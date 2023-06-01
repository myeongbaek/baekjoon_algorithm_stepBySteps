package com.algorithm.baekjoon.ch05;

import java.io.*;

class ch05_10 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static final int ASCII_A = 65;

    public static void main(String[] args) throws IOException {
        // A : 65, Z : 90
        String[] str = br.readLine().split("");
        int minTime = 0;
        for (String s : str) {
            int ascii = (int) s.charAt(0) - ASCII_A;
            // 7번과 9번 보정
            if (ascii >= 24) {
                ascii -= 2;
            } else if (ascii >= 18) {
                ascii -= 1;
            }
            minTime += ascii / 3 + 3;
        }
        bw.write("" + minTime);
        bw.flush();
        bw.close();
    }
}
