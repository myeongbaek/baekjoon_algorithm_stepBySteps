package com.algorithm.baekjoon.ch05;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class ch05_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static final int ALPHABET = 26;
    public static final int ASCII_a = 97;

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split("");
        int[] alphabet = new int[ALPHABET];
        Arrays.fill(alphabet, -1); // 배열을 -1 값으로 초기화
        // a : 97, ... z : 122
        for(int i = 0; i < str.length; i++){
            int ascii_index = str[i].charAt(0) - ASCII_a;
            if(alphabet[ascii_index] == -1){
                alphabet[ascii_index] = i;
            }
        }
        for(int i = 0; i < ALPHABET; i++){
            bw.write("" + alphabet[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
