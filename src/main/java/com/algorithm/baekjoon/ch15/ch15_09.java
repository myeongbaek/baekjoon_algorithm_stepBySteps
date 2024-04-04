package com.algorithm.baekjoon.ch15;

import java.util.Scanner;
public class ch15_09 {
    // 창문 닫기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i * i <= N; i++){
            cnt++;
        }

        System.out.println(cnt);
    }
}