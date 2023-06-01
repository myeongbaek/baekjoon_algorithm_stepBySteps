package com.algorithm.baekjoon.ch03;

import java.io.*;
import java.util.StringTokenizer;

class ch03_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String result = "int";
        for(int i = 0; i < (N + 3) / 4; i++){
            result = "long " + result;
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
