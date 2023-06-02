package com.algorithm.baekjoon.ch10;

import java.io.*;
import java.util.StringTokenizer;

class ch10_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 세 점의 값을 저장한 후 유일한 값을 도출합니다.
        // 유일한 값은 마지막 네 번째 좌표입니다.
        int[] pointX = new int[3];
        int[] pointY = new int[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            pointX[i] = Integer.parseInt(st.nextToken());
            pointY[i] = Integer.parseInt(st.nextToken());
        }
        int x = pointX[0] == pointX[1] ? pointX[2] : (pointX[0] == pointX[2] ? pointX[1] : pointX[0]);
        int y = pointY[0] == pointY[1] ? pointY[2] : (pointY[0] == pointY[2] ? pointY[1] : pointY[0]);
        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}
