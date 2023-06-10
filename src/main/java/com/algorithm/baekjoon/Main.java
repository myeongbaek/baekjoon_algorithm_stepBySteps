package com.algorithm.baekjoon;

import java.io.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int result = -1;
        // 5 키로그램으로 최대한 많이 담는 경우에서부터 따져본다
        for(int i = N / 5; i >= 0; i--){
            if((N - 5 * i) % 3 == 0){
                result = i + (N - 5 * i) / 3;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}

