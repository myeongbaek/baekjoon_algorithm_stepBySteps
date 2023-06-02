package com.algorithm.baekjoon.ch10;

import java.io.*;
import java.util.StringTokenizer;

class ch10_08{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int total = 0;
        int max = 0;
        for(int i = 0; i < 3; i++){
            int sideLength = Integer.parseInt(st.nextToken());
            max = Math.max(max, sideLength);
            total += sideLength;
        }
        if(max >= total - max){
            bw.write(String.valueOf((total - max) * 2 - 1));
        } else{
            bw.write(String.valueOf(total));
        }
        bw.flush();
        bw.close();
    }
}
