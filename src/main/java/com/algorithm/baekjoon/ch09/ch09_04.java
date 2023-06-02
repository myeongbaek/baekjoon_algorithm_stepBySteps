package com.algorithm.baekjoon.ch09;

import java.io.*;
import java.util.StringTokenizer;

// 소수 찾기
class ch09_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // N개의 자연수가 주어집니다.
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] numArray = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            if(n > max){
                max = n;
            }
            numArray[i] = n;
        }
        boolean[] isNotPrime = getPrimeNumber(max);
        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(!isNotPrime[numArray[i]]){
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    private static boolean[] getPrimeNumber(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[1] = true;

        for(int i = 2; i <= n; i++){
            for(int j = i * 2; j <= n; j += i){
                isNotPrime[j] = true;
            }
        }
        return isNotPrime;
    }

}
