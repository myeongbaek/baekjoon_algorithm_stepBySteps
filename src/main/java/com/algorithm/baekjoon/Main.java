package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[5];
        int total = 0;
        // 입력
        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());
            numbers[i] = n;
            total += n;
        }
        Arrays.sort(numbers);

        //출력
        bw.write("" + total / 5 + "\n" + numbers[2]);
        bw.flush();
        bw.close();
    }
}

