package com.algorithm.baekjoon;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

class ch14_06 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> hm = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            hm.put(br.readLine(), 0);
        }

        for(int i = 0; i < M; i++){
            String key = br.readLine();
            if(hm.containsKey(key)){
                cnt++;
                result.put(key, 0);
            }
        }
        bw.write(String.valueOf(cnt) + '\n');
        for(String key : result.keySet()){
            bw.write(key + "\n");
        }

        bw.flush();
        bw.close();
    }
}
