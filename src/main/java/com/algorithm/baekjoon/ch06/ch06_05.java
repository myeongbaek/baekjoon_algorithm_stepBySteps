package com.algorithm.baekjoon.ch06;

import java.io.*;

class ch06_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int ALPHABET_A = 65;
    private static final int ALPHABET_a = 97;
    private static final int ALPHABET = 26;

    public static void main(String[] args) throws IOException {
        // A : 65, a : 97 ,,, Z : 90, z : 122
        int[] alphabet = new int[ALPHABET];
        String[] str = br.readLine().split("");
        for (String s : str){
            int convertedToAscii = s.charAt(0);
            if(convertedToAscii >= 97){
                // 소문자
                alphabet[convertedToAscii - ALPHABET_a] += 1;
            } else{
                // 대문자
                alphabet[convertedToAscii - ALPHABET_A] += 1;
            }
        }

        StringBuilder result = new StringBuilder();
        int max = 0;
        for (int i = 0; i < ALPHABET; i++){
            int a = alphabet[i];
            if (max < a){
                max = a;
                result = new StringBuilder(String.valueOf((char)(i + ALPHABET_A)));
            } else if (max == a){
                result.append((char)(i + ALPHABET_A));
            }
        }

        if(result.length() > 1){
            bw.write("?");
        } else{
            bw.write(result.toString());
        }

        bw.flush();
        bw.close();
    }
}
