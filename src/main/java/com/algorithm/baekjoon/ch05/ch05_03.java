package com.algorithm.baekjoon.ch05;

import java.io.*;

class ch05_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String str = br.readLine();
            bw.write("" + str.charAt(0) + str.charAt(str.length() - 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
