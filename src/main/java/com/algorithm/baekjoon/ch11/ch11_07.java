package com.algorithm.baekjoon.ch11;

import java.io.*;
import java.util.StringTokenizer;

class ch11_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(a1 * n0 + a0 <= c * n0 && a1 <= c){
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
