package com.algorithm.baekjoon.ch03;

import java.io.*;
import java.util.StringTokenizer;

class ch03_12 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static String str;

    public static void main(String[] args) throws IOException {
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
