package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch19_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(n * (n - 1)));
        bw.flush();
        bw.close();
    }
}
