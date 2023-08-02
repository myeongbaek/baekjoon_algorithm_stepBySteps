package com.algorithm.baekjoon.ch14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class ch14_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> hm = new HashMap<>();
        // 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            hm.put(Integer.parseInt(st.nextToken()), 0);
        }

        // 검사 & 출력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++){
            int m = Integer.parseInt(st.nextToken());
            if (hm.containsKey(m)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();

    }
}
