package com.algorithm.baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ch20_02 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                cnt += map.size();
                map.clear();
            } else {
                map.put(input, 0);
            }
        }
        bw.write(String.valueOf(cnt + map.size()));
        bw.flush();
        bw.close();
    }
}