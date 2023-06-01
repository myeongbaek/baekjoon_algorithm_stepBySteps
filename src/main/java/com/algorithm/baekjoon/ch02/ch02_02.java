package com.algorithm.baekjoon.ch02;

import java.io.*;
import java.util.StringTokenizer;

class ch02_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int score = Integer.parseInt(br.readLine());
        if (score >= 90) {
            bw.write("A");
        } else if (score >= 80) {
            bw.write("B");
        } else if (score >= 70) {
            bw.write("C");
        } else if (score >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }
        bw.flush();
        bw.close();
    }
}
