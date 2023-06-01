package com.algorithm.baekjoon.ch07;

import java.io.*;
import java.util.StringTokenizer;

class ch07_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    private static final int N = 100;
    private static final int M = 10;

    public static void main(String[] args) throws IOException {
        boolean[][] area = new boolean[N][N];
        int areaTotal = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = 0; j < M; j++){
                for(int k = 0; k < M; k++){
                    int r = x + j;
                    int c = y + k;
                    if(!area[r][c]){
                        areaTotal++;
                        area[r][c] = true;
                    }
                }
            }
        }
        bw.write(String.valueOf(areaTotal));
        bw.flush();
        bw.close();
    }
}
