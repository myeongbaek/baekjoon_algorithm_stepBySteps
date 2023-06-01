package com.algorithm.baekjoon.ch05;

import java.io.*;
import java.util.StringTokenizer;

class ch05_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String[] S = st.nextToken().split("");

            for(String s : S){
                bw.write(s.repeat(r));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
