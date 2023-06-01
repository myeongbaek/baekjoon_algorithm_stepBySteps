package com.algorithm.baekjoon.ch07;

import java.io.*;
import java.util.StringTokenizer;

class ch07_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] array = new int[N][M];
        for(int k = 0; k < 2; k++){
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < M; j++){
                    array[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                bw.write("" + array[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
