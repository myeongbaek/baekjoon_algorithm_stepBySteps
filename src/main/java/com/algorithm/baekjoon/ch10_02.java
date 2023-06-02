package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch10_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int row = Math.min(x, w - x);
        int col = Math.min(y, h - y);
        bw.write(String.valueOf(Math.min(row, col)));
        bw.flush();
        bw.close();
    }
}
