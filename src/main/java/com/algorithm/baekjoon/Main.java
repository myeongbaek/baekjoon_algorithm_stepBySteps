package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> hm = new HashMap<>();

        //입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int ele = Integer.parseInt(st.nextToken());
            origin[i] = ele;
            sorted[i] = ele;
        }

        // 순위 (압축)
        Arrays.sort(sorted);
        int index = 0;
        for(int i = 0; i < N; i++){
            if (!hm.containsKey(sorted[i])){
                hm.put(sorted[i], index++);
            }
        }

        //출력
        for (int i = 0; i < N; i++) {
            bw.write(hm.get(origin[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
