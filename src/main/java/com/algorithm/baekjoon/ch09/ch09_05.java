package com.algorithm.baekjoon.ch09;

import java.io.*;

class ch09_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean[] isNotPrime = getPrimeNumberArray(N);
        int sum = 0;
        int firstPrimeNumber = 0;
        for(int i = M; i <= N; i++){
            if(!isNotPrime[i]){
                if(sum == 0){
                    firstPrimeNumber = i;
                }
                sum += i;
            }
        }
        if(sum == 0){
            bw.write(String.valueOf(-1));
        } else{
            bw.write("" + sum + '\n' + firstPrimeNumber);
        }

        bw.flush();
        bw.close();
    }

    private static boolean[] getPrimeNumberArray(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[1] = true;
        for(int i = 2; i <= n; i++){
            if(isNotPrime[i]){
                continue;
            }
            for(int j = i * 2; j <= n; j += i){
                isNotPrime[j] = true;
            }
        }
        return isNotPrime;
    }

}
