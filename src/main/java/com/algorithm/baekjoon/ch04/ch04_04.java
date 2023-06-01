package com.algorithm.baekjoon.ch04;

import java.io.*;
import java.util.StringTokenizer;

class ch04_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for(int j = a - 1; j < b; j++){
                array[j] = c;
            }
        }

        for(int i = 0; i < N; i++){
            bw.write("" + array[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
