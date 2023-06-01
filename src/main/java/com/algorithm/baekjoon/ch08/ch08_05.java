package com.algorithm.baekjoon.ch08;

import java.io.*;

class ch08_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int level = 1;
        int lastElement = 1;
        while (N > lastElement) {
            lastElement += 6 * level;
            level += 1;
        }
        bw.write(String.valueOf(level));
        bw.flush();
        bw.close();
    }
}
