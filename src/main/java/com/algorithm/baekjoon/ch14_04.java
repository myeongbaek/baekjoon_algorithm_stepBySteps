package com.algorithm.baekjoon;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class ch14_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 포켓몬수
        int M = Integer.parseInt(st.nextToken()); // 문제 수

        Map<String, Integer> hm1 = new HashMap<>();
        Map<Integer, String> hm2 = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String poketmon = br.readLine();
            hm1.put(poketmon, i);
            hm2.put(i, poketmon);
        }
        for(int i = 0; i < M; i++){
            String question = br.readLine();
            try{
                int key = Integer.parseInt(question);
                bw.write(hm2.get(key));
                bw.newLine();
            } catch (Exception e){
                bw.write(String.valueOf(hm1.get(question)));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
