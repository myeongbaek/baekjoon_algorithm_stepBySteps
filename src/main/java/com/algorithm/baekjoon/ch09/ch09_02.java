package com.algorithm.baekjoon.ch09;

import java.io.*;
import java.util.StringTokenizer;

class ch09_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int result = 0;
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                cnt++;
                if(cnt == K){
                    result = i;
                    break;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
