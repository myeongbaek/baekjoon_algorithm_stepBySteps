package com.algorithm.baekjoon.ch08;

import java.io.*;
import java.util.StringTokenizer;

class ch08_08 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        StringBuilder A = new StringBuilder(st.nextToken());
        StringBuilder B = new StringBuilder(st.nextToken());
        StringBuilder result = new StringBuilder();
        A.reverse();
        B.reverse();
        int N = A.length();
        int M = B.length();
        int max = Math.max(N, M);

        int carry = 0;
        for (int i = 0; i < max; i++) {
            int sum = carry;
            if (i < N) {
                sum += (int) A.charAt(i) - '0';
            }
            if (i < M) {
                sum += (int) B.charAt(i) - '0';
            }
            int place = sum % 10;
            carry = sum / 10;
            result.append(place);
        }
        if (carry != 0) {
            result.append(carry);
        }

        bw.write(result.reverse().toString());
        bw.flush();
        bw.close();
    }

}
