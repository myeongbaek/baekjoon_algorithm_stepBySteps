package com.algorithm.baekjoon.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class ch15_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            while(true){
                boolean isPrime = true;
                // 소수판별
                for(long j = 2; j <= Math.sqrt(num); j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                // 종료조건
                if(isPrime){
                    if(!(num == 0 || num == 1)){
                        bw.write(String.valueOf(num));
                        bw.newLine();
                        break;
                    }
                }
                num++;
            }

        }
        bw.flush();
        bw.close();
    }
}