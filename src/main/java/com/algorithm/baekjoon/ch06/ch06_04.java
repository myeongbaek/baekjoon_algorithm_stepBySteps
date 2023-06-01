package com.algorithm.baekjoon.ch06;

import java.io.*;

class ch06_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String word = br.readLine();
        int n = word.length();
        String result = "1";
        for(int i = 0; i < n; i++){
            char a = word.charAt(i);
            char b = word.charAt(n - i - 1);
            if (a != b){
                result = "0";
                break;
            }
        }
        bw.write(result);
//        //스트링 빌더의 reverse를 활용한 풀이
//        StringBuilder sb = new StringBuilder(br.readLine());
//        bw.write( sb.toString().equals(sb.reverse().toString()) ? "1" : "0");
        bw.flush();
        bw.close();
    }
}
