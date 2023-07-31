package com.algorithm.baekjoon;

import java.io.*;
import java.util.*;

class ch14_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < N; i++){
            String name = br.readLine().split(" ")[0];
            if(!hm.containsKey(name)){
                hm.put(name, 0);
            } else {
                hm.remove(name);
            }
        }

        List<String> keyList = new ArrayList<>(hm.keySet());
        keyList.sort(Comparator.reverseOrder());
        for(String key : keyList){
            bw.write(key);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
