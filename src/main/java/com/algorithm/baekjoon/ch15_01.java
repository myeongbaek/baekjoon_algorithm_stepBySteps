package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch15_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = gcd(a, b);
            int lcm = a * b / gcd;
            bw.write(String.valueOf(lcm));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b){
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
