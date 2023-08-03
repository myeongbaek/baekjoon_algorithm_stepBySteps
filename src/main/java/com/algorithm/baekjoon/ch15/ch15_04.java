package com.algorithm.baekjoon.ch15;

import java.io.*;

class ch15_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 1 <-2-> 3 <-4-> 7 <-6-> 13 => 1 + 2 = 3
    // 4, 6, 6 => 2 => 1, 2, 2 => 5
    // 각 간격의 gcd를 구한 후 각 간격을 gcd로 나눈 값에서 1을 뺀 값을 모두 더함.

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        int[] distance = new int[N - 1];

        // 입력
        for(int i = 0; i < N; i++){
            int loc = Integer.parseInt(br.readLine());
            trees[i] = loc;
        }
        // 간격
        for(int i = 0; i < N - 1; i++){
            distance[i] = trees[i + 1] - trees[i];
        }
        // gcd
        int gcd = distance[0];
        for(int i = 0; i < distance.length; i++){
            gcd = gcd(distance[i], gcd);
        }
        // total
        int sum = 0;
        for(int i : distance){
            sum += i / gcd - 1;
        }
        // 출력
        bw.write(String.valueOf(sum));
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
