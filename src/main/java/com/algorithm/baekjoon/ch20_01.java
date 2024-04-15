package com.algorithm.baekjoon;

import java.io.*;
import java.util.*;
public class ch20_01 {
    //양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
    // 해법 :
    // 1. 진짜 약수 개수가 짝수인 경우 => 최소값 * 최대값
    // 2. 진짜 약수 개수가 홀수인 경우 => 제곱수 => 정렬 후 제곱
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        // 입력
        int N = Integer.parseInt(br.readLine());
        boolean isEven = N % 2 == 0 ? true : false;
        int[] input = new int[N];
        st = new StringTokenizer(br.readLine());

        if(isEven){
            int min = 1000000, max = 0;

            for(int i = 0; i < N; i++){
                int value = Integer.parseInt(st.nextToken());
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
            bw.write(String.valueOf(min * max));
        } else {
            for(int i = 0; i < N; i++){
                input[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(input);
            bw.write(String.valueOf(input[N / 2] * input[N / 2]));
        }

        bw.flush();
        bw.close();
    }
}