package com.algorithm.baekjoon.ch08;

import java.io.*;
import java.util.StringTokenizer;

class ch08_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while(N != 0){
            int rem = N % B;
            if (10 <= rem && rem <= 36){
                sb.append((char)(rem + 'A' - 10));
            } else{
                sb.append((char)(rem + '0'));
            }
            N /= B;
        }
        sb.reverse();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
