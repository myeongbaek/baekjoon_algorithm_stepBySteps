package com.algorithm.baekjoon.ch10;

import java.io.*;
import java.util.StringTokenizer;

class ch10_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long area = 0L;
        int N = Integer.parseInt(br.readLine());
        // 최소점과 최대점을 구한다.
        int minX = 10000, minY = 10000, maxX = -10000, maxY = -10000;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        area = (long) (maxX - minX) * (maxY - minY);

        bw.write(String.valueOf(area));
        bw.flush();
        bw.close();
    }
}
