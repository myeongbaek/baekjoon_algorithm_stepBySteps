package com.algorithm.baekjoon.ch02;

import java.io.*;
import java.util.StringTokenizer;

class ch02_06
{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        bw.write("" + ((A + (B + C) / 60) >= 24 ? (A + (B + C) / 60) - 24 : (A + (B + C) / 60)) + " " + (B + C) % 60);
        bw.flush();
        bw.close();
    }
}
