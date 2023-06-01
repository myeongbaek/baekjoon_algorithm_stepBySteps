package com.algorithm.baekjoon.ch04;

import java.io.*;
import java.util.StringTokenizer;

class ch04_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int max = 1;
        int index = 1;
        for (int i = 0; i < 9; i++){
            int a = Integer.parseInt(br.readLine());
            if(a > max){
                max = a;
                index = i + 1;
            }
        }
        bw.write("" + max + "\n" + index);
        bw.flush();
        bw.close();
    }
}
