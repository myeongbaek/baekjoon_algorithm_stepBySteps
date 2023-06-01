package com.algorithm.baekjoon.ch04;

import java.io.*;
import java.util.StringTokenizer;

class ch04_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int min = 1000000;
        int max = -1000000;
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(array[i]);
            if(min > a){
                min = a;
            }
            if(max < a){
                max = a;
            }
        }
        bw.write(String.format("%d %d", min, max));
        bw.flush();
        bw.close();
    }
}
