package com.algorithm.baekjoon;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        Map<String, Integer> hm = new HashMap<>();
        // 입력 & 검사
        for(int i = 0; i < N + M; i++){
            if(i < N){
                hm.put(br.readLine(), 0);
            } else {
                if(hm.containsKey(br.readLine())){
                    cnt++;
                }
            }
        }
        // 출력
        bw.write(cnt + "");
        bw.flush();
        bw.close();


    }
}
