package com.algorithm.baekjoon;

import java.io.*;

class ch13_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static final int MAXVALUE = 10_001;

    public static void main(String[] args) throws IOException {
        int i, n;
        //입력
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] result = new int[N];
        int[] counting = new int[MAXVALUE];

        // 입력, counting
        for (i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            numbers[i] = n;
            counting[n]++;
        }
        // 축척
        for (i = 0; i < MAXVALUE - 1; i++) {
            counting[i + 1] += counting[i];
        }
        // 누적합 - 1 위치에 결과값 배치
        for (i = 0; i < N; i++) {
            result[counting[numbers[i]] - 1] = numbers[i];
            counting[numbers[i]]--; // 중복 요소
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < N; i++) {
            sb.append(result[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

