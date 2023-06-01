package com.algorithm.baekjoon.ch05;

import java.io.*;
import java.util.StringTokenizer;

class ch05_09 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String reversedString = "";
        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        for(int i = 2; i >= 0; i--){
            int a = A.charAt(i);
            int b = B.charAt(i);
            if (a > b){
                for(String s : A.split("")){
                    reversedString = s + reversedString;
                }
                break;
            } else if (a < b){
                for(String s : B.split("")){
                    reversedString = s + reversedString;
                }
                break;
            }
        }
        bw.write("" + reversedString);
        bw.flush();
        bw.close();
    }
}
