package com.algorithm.baekjoon;

import java.util.Scanner;
public class ch19_05 {
    // 다리 놓기
    // M개 중 N개를 순차적으로 선택함.
    // 만약 N이 1이고 M이 3인 경우
    // (1, 0, 0), (0, 1, 0), (0, 0, 1)이 됨
    // 만약 N이 2이고 M이 3인 경우
    // (1, 1, 0), (1, 0, 1), (0, 1, 1) 이 됨. 즉 mCn m개 중 n개를 뽑는 경우의 수를 구하는 것과 동일한 상황임.
    // 즉 결과값은 m! / n! (m-n)!
    private static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            String[] testCase = sc.nextLine().split(" ");
            int N = Integer.parseInt(testCase[0]);
            int M = Integer.parseInt(testCase[1]);
            int a = 1;
            int b = 1;
            int c = 1;

            for(int j = 1; j <= M; j++){
                a *= j;
                if(j <= N){
                    b *= j;
                }
                if(j <= M - N){
                    c *= j;
                }
            }

            int result = a / (b * c);
            System.out.println(String.valueOf(result));

        }
    }
}