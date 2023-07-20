package com.algorithm.baekjoon;

import java.io.*;
import java.util.*;

class ch13_6 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String N = br.readLine();
        int len = N.length();
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = N.charAt(i) - '0';
        }
        Arrays.sort(array);
        for(int i = len - 1; i >= 0; i--){
            bw.write(String.valueOf(array[i]));
        }
        bw.flush();
        bw.close();
    }
}

