package com.algorithm.baekjoon.ch12;

import java.io.*;
import java.util.StringTokenizer;

class ch12_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        // D = 1 / (ae - bd)
        // e   -b    c
        // -d   a    f
        int D = a * e - b * d;
        int x = (c * e - b * f) / D;
        int y = (a * f - c * d) / D;
        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}
