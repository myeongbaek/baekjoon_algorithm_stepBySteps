package com.algorithm.baekjoon.ch12;

import java.io.*;

class ch12_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = 0;

        // 맨 앞자리 수와 자리수를 고려하여 탐색할 범위를 제한한다.
        // MSP, Place
        String N = br.readLine();
        int n = Integer.parseInt(N);
        int place = N.length();
        int msp = N.charAt(0) - '0';
        int maxSumOfEachPlace = (msp - 1) + 9 * (place - 1);
        int startNumber = n - maxSumOfEachPlace;
        for (int i = startNumber; i < n; i++) {
            int subtotal = getSubTotal(i);
            if (subtotal == n) {
                result = i;
                break;
            }
        }

        // 1부터 N까지 모든 경우를 살핀다.
        int result2 = 0;
        for (int i = 1; i <= n; i++) {
            if (getSubTotal(i) == n) {
                result2 = i;
                break;
            }
        }

        bw.write(result + " " + result2);
        bw.flush();
        bw.close();
    }

    // 일일이 대입을 하나 1부터 N까지 모든 경우가 아닌
    private static int getSubTotal(int n) {
        int subtotal = n;
        while (n != 0) {
            subtotal += n % 10;
            n /= 10;
        }
        return subtotal;
    }
}
