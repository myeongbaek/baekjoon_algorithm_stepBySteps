package com.algorithm.baekjoon.ch02;

import java.io.*;
import java.util.StringTokenizer;

class ch02_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int year = Integer.parseInt(br.readLine());
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            bw.write("1");
        } else{
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}
