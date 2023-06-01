package com.algorithm.baekjoon.ch05;

import java.io.*;

class ch05_11 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = "";
        while((str = br.readLine()) != null && !str.isEmpty()){
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}
