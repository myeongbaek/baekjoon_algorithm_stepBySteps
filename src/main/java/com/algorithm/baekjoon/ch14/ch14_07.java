package com.algorithm.baekjoon.ch14;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;


class ch14_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        Map<Integer, Integer> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int input = 0;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            input = Integer.parseInt(st.nextToken());
            hm.put(input, 0);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M; i++){
            input = Integer.parseInt(st.nextToken());
            if(hm.containsKey(input)){
                cnt++;
            }
        }
        bw.write(String.valueOf(N + M - 2 * cnt));
        bw.flush();
        bw.close();
    }
}
