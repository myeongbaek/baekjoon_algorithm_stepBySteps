package com.algorithm.baekjoon.ch05;

import java.io.*;
import java.util.StringTokenizer;

class ch05_08 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        bw.write("" + st.countTokens());
        bw.flush();
        bw.close();
    }
}
