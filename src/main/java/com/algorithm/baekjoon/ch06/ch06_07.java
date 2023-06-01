package com.algorithm.baekjoon.ch06;

import java.io.*;
import java.util.StringTokenizer;

class ch06_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        String[] croaAlphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        while (str.length() != 0) {
            String substr = str;
            for(String s : croaAlphabet){
                if(str.startsWith(s)){
                    substr = substr.substring(s.length());
                    count++;
                    break;
                }
            }
            if (str.equals(substr)){
                str = str.substring(1);
                count++;
            } else{
                str = substr;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
