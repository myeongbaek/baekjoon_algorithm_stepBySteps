package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class ch13_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        //입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(numbers);

        // 출력
        bw.write("" + numbers[N - k]);
        bw.flush();
        bw.close();
    }
}

