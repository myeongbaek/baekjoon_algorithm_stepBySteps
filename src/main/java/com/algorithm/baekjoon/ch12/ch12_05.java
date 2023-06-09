package com.algorithm.baekjoon.ch12;

import java.io.*;

class ch12_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        // 1. 구간을 나눠 푼다.
        // ___ 0666 => 19개
        // __6 0666 => 109개
        // _66 0666 => 1009개
        // 666 0666 => 10009개
        // 2. 숫자를 1에서부터 하나 씩 증가시켜 만약 666이 포함된 경우 카운트 한다.
        int cnt = 0;
        int n = 665;
        while (cnt != N) {
            n++;
            if (String.valueOf(n).contains("666")) {
                cnt++;
            }
        }
        bw.write(String.valueOf(n));


        bw.flush();
        bw.close();
    }
}

