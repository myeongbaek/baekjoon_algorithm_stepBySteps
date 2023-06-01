package com.algorithm.baekjoon.ch04;

import java.io.*;

class ch04_00 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int V = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(data[i]);
            if (a == V){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
