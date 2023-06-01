package com.algorithm.baekjoon.ch01;

import java.io.*;
import java.util.StringTokenizer;

public class A_Plus_B {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String result = String.valueOf(a + b);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
