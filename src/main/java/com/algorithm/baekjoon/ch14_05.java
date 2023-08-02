package com.algorithm.baekjoon;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class ch14_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> hm = new HashMap<>();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int number = Integer.parseInt(st.nextToken());
            if(hm.containsKey(number)){
                hm.put(number, hm.get(number) + 1);
            } else {
                hm.put(number, 1);
            }
        }
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int key = Integer.parseInt(st.nextToken());
            if(hm.containsKey(key)){
                bw.write(hm.get(key) + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
