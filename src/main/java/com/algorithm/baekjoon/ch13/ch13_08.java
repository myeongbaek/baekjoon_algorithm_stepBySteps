package com.algorithm.baekjoon.ch13;

import java.util.*;
import java.io.*;
class ch13_08 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        // 입력
        int N = Integer.parseInt(br.readLine());
        int[][] p = new int[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            p[i][0] = Integer.parseInt(st.nextToken());
            p[i][1] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(p, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            } else{
                return o1[1] - o2[1];
            }
        });
        // 출력
        for(int i = 0; i < N; i++){
            bw.write(p[i][0] + " " + p[i][1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
