package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch19_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
