package com.algorithm.baekjoon.ch10;

import java.io.*;
import java.util.StringTokenizer;

class ch10_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] sidesOfTriangle = new int[3];
        while (true) {
            int max = 0;
            int total = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                int sideLength = Integer.parseInt(st.nextToken());
                sidesOfTriangle[i] = sideLength;
                max = Math.max(max, sideLength);
                total += sideLength;
            }
            if (max == 0) {
                break;
            }
            if (max >= total - max) {
                bw.write("Invalid");
            } else {
                if (sidesOfTriangle[0] == sidesOfTriangle[1] && sidesOfTriangle[0] == sidesOfTriangle[2]) {
                    bw.write("Equilateral");
                } else if (sidesOfTriangle[0] == sidesOfTriangle[1] || sidesOfTriangle[0] == sidesOfTriangle[2] || sidesOfTriangle[1] == sidesOfTriangle[2]) {
                    bw.write("Isosceles");
                } else {
                    bw.write("Scalene");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
