package com.algorithm.baekjoon.ch03;

import java.io.*;
import java.util.StringTokenizer;

class ch03_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + (a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
