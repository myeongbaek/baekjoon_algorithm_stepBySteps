package com.algorithm.baekjoon.ch08;

import java.io.*;

class ch08_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(br.readLine());
        // 어떤 N번째 줄에 X가 위치하고 있는지 확인한다.
        int N = 0;
        int sum = 0;
        while (sum < X) {
            N += 1;
            sum += N;
        }
        // N이 짝수인 경우 분자는 감소, 분모는 증가한다.
        // N이 홀수인 경우 분자는 증가, 분모는 감소한다.
        int numerator = 0;
        int denominator = 0;
        int difference = sum - X;
        if (N % 2 == 0) {
            numerator = N - difference;
            denominator = 1 + difference;
        } else {
            numerator = 1 + difference;
            denominator = N - difference;
        }
        bw.write(String.format("%d/%d", numerator, denominator));
        bw.flush();
        bw.close();
    }

}
