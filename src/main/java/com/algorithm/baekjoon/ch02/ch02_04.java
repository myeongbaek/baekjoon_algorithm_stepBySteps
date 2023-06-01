package com.algorithm.baekjoon.ch02;

import java.io.*;
import java.util.StringTokenizer;

class ch02_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if (x > 0) {
            if (y > 0) {
                bw.write("1");
            } else {
                bw.write("4");
            }
        } else {
            if (y > 0) {
                bw.write("2");
            } else {
                bw.write("3");
            }
        }

        bw.flush();
        bw.close();
    }
}
