package com.algorithm.baekjoon.ch04;

import java.io.*;
import java.util.StringTokenizer;

class ch04_09 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        float totalSum = 0;
        int maxValue = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            totalSum += a;
            if(a > maxValue){
                maxValue = a;
            }
        }

        float average = (totalSum / N) / maxValue * 100;
        bw.write("" + average);
        bw.flush();
        bw.close();
    }
}
