package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch19_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i = 0; i < n; i++){
            result *= 2;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
