package com.algorithm.baekjoon.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ch15_07 {
    // 베르트랑 공준
    // 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
    //이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
    //예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
    //자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        while(n != 0){
            int cnt = 0;
            for(int i = n + 1; i <= 2 * n; i++){
                if(isPrime(i)){
                    cnt++;
                }
            }
            bw.write(String.valueOf(cnt));
            bw.newLine();
            n = Integer.parseInt(br.readLine());
        }
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        if (n == 2) {
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}