package com.algorithm.baekjoon.ch08;

import java.io.*;
import java.util.StringTokenizer;

class ch08_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int j = 1;
        int result = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z'){
                result += (ch - 'A' + 10) * j;
            } else{
                result += (ch - '0') * j;
            }
            j *= N;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
