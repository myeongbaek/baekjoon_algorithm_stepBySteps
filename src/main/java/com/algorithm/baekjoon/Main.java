package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[][] array = new String[N][2];

        // 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        // 정렬
        Arrays.sort(array, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        // 출력
        for (int i = 0; i < N; i++) {
            bw.write(array[i][0] + " " + array[i][1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
