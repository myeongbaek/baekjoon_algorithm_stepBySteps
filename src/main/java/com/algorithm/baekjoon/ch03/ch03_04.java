package com.algorithm.baekjoon.ch03;


import java.io.*;
import java.util.StringTokenizer;

class ch03_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            X -= a * b;
        }
        if (X == 0) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }
}
