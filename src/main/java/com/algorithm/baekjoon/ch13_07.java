package com.algorithm.baekjoon;

import java.io.*;
import java.util.*;

class ch13_7 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];
        // 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        // 람다식을 활용한 정렬
        Arrays.sort(array, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        // 출력
        for(int i = 0; i < N; i++){
            bw.write(array[i][0] + " " + array[i][1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

