package com.algorithm.baekjoon.ch02;

import java.io.*;
import java.util.StringTokenizer;

class ch02_0 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && b == c){
            bw.write(String.valueOf(10000 + a * 1000));
        } else if(a == b || b == c || c == a){
            if (b == c){
                bw.write(String.valueOf(1000 + b * 100));
            } else{
                bw.write(String.valueOf(1000 + a * 100));
            }
        } else{
            int max = Math.max(a, b);
            max = Math.max(max, c);
            bw.write(String.valueOf(max * 100));
        }
        bw.flush();
        bw.close();
    }
}
