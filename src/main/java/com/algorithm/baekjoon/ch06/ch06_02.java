package com.algorithm.baekjoon.ch06;

import java.io.*;
import java.util.StringTokenizer;

class ch06_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] chessArray = new int[]{1, 1, 2, 2, 2, 8};
        String[] inputArray = br.readLine().split(" ");
        for(int i = 0; i < chessArray.length; i++){
            bw.write("" + (chessArray[i] - Integer.parseInt(inputArray[i])) + " ");
        }
        bw.flush();
        bw.close();
    }
}
