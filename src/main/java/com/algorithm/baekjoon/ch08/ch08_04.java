package com.algorithm.baekjoon.ch08;

import java.io.*;
import java.util.StringTokenizer;

class ch08_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        double[] ans = new double[N + 1];

        // 0:  4
        // 1: 4 + (5 * 4^0 - 0) = 9
        // 2: 4 + 5 + (5 * 4^1 - 겹치는점)  = 25
        // 3: 25 + 5*16 - 겹치는점 =
        // k번의 겹치는 점의 갯수 = 이전 단계에서 맞닿은 내부의 면의 갯수 = 2^k-1 * (2^k-1 - 1) * 2

        for (int i = 0; i <= N; i++) {
            if (i != 0) {
                double newDot = 5 * Math.pow(4, i - 1);
                double overlapped = Math.pow(2, i) * (Math.pow(2, i - 1) - 1);
                ans[i] = ans[i - 1] + newDot - overlapped;
            } else {
                ans[i] = 4;
            }
        }
        bw.write(String.valueOf((int) ans[N]));
        bw.flush();
        bw.close();
    }
}
