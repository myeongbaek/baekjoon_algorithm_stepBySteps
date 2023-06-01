package com.algorithm.baekjoon.ch04;

import java.io.*;

class ch04_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static final int DIVISOR = 42;
    public static final int NUMBER = 10;


    public static void main(String[] args) throws IOException {
        boolean[] reminder = new boolean[DIVISOR];
        for(int i = 0; i < NUMBER; i++){
            int dividend = Integer.parseInt(br.readLine());
            reminder[dividend % DIVISOR] = true;
        }
        int count = 0;
        for(int i = 0; i < DIVISOR; i++){
            if(reminder[i]){
                count++;
            }
        }
        bw.write("" + count);
        bw.flush();
        bw.close();
    }
}
