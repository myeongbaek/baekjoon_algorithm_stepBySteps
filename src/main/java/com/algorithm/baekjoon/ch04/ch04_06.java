package com.algorithm.baekjoon.ch04;

import java.io.*;
import java.util.StringTokenizer;

class ch04_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static final int STUDENT = 30;


    public static void main(String[] args) throws IOException {
        boolean[] assignment = new boolean[STUDENT];
        for (int i = 0; i < STUDENT - 2; i++) {
            int number = Integer.parseInt(br.readLine());
            assignment[number - 1] = true;
        }
        for (int i = 0; i < STUDENT; i++){
            if(!assignment[i]){
                bw.write("" + (i + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
