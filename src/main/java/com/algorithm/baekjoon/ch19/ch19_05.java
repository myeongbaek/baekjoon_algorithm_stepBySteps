package com.algorithm.baekjoon.ch19;

import java.io.*;
import java.util.StringTokenizer;

public class ch19_05 {
    // 다리 놓기
    // nCr = n! / r!(n-r)! 을 적용하려니 n=30, r=15일 때 팩토리얼 값이 초과함.
    // nCr = n-1Cr + n-1Cr-1
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[][] result = new int[30][30];

    public static void main(String[] args) throws Exception{

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(combination(M, N)));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static int combination(int n, int r){

        if(result[n][r] > 0 || result[n][n-r] > 0){
            return result[n][r];
        }
        if (n < r){
            return 0;
        }
        if (n == r){
            return 1;
        }
        if(r <= 1){
            return n;
        }
        int combi =  combination(n - 1, r) + combination(n - 1, r - 1);
        result[n][r] = combi;
        result[n][n - r] = combi;
        return combi;
    }
}