package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class ch15_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a % b == 0){
            bw.write(String.valueOf(a));
        } else if(b % a == 0){
            bw.write(String.valueOf(b));
        } else {
            int gcd = gcd(a, b);
            long lcm = (long) a * b / gcd;
            bw.write(String.valueOf(lcm));
        }
        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
