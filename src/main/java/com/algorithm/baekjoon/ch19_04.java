package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch19_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 이항계수 (n, k)
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        // 0! ~ n! 값을 구한다, 이때 0!은 1과 같다.
        int[] memo = new int[n + 1];
        memo[0] = 1;
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
            memo[i] = factorial;
        }

        // n! / k!(n - k)!
        bw.write(String.valueOf(memo[n] / (memo[k] * memo[n - k])));
        bw.flush();
        bw.close();
    }
}
