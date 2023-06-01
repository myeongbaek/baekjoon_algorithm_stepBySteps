package com.algorithm.baekjoon.ch08;

import java.io.*;
import java.util.StringTokenizer;

class ch08_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int[] coin = new int[]{25, 10, 5, 1};
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            for(int j = 0; j < 4; j++){
                int c = coin[j];
                int n = C / c;
                C -= n * c;
                bw.write("" + n + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
