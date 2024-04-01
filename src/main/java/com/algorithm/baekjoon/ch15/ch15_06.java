package com.algorithm.baekjoon.ch15;

import java.util.Scanner;

public class ch15_06 {
    // M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

    public static void main(String[] args){
        // 입력
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int M = Integer.parseInt(input.split(" ")[0]);
        int N = Integer.parseInt(input.split(" ")[1]);

        // 소수 출력
        for(int i = M; i <= N; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n){

        if (n < 2){
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