package com.algorithm.baekjoon.ch09;

import java.io.*;
import java.util.StringTokenizer;

class ch09_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 종료조건
            if (a == 0 && b == 0) {
                break;
            }
            // 나머지가 0 인 경우 factor 이거나 multiple 입니다.
            if (b % a == 0) {
                bw.write("factor");
            } else if (a % b == 0) {
                bw.write("multiple");
            } else {
                bw.write("neither");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
