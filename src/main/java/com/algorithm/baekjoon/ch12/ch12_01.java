package com.algorithm.baekjoon.ch12;

import java.io.*;
import java.util.StringTokenizer;

class ch12_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static int dx[] = {0, 0, 1, -1};
    public static int dy[] = {1, -1, 0, 0};
    public static int n, m, k;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // M을 넘지 않는 3개의 합을 구하며 그 중 가장 큰 값을 구한다.
        int result = 0;
        for(int i = 0; i < N-2; i++){
            int sum = numbers[i];
            for(int j = i + 1; j < N - 1; j++){
                sum += numbers[j];
                if(sum > M){
                    sum -= numbers[j];
                    continue;
                }
                for(int k = j + 1; k < N; k++){
                    sum += numbers[k];
                    if(sum <= M){
                        if(result < sum){
                            result = sum;
                        }
                    }
                    sum -= numbers[k];
                }
                sum -= numbers[j];
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
