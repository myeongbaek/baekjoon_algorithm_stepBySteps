package com.algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 입력 1~5
        // 1. 갯수 N
        int N = Integer.parseInt(br.readLine());
        // 2. 길이가 N인 수열 A에 대하여 0 이면 큐, 1이면 스택
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 3. 길이가 N인 수열 B에 대하여 원소를 입력으로 받는다.
        int[] B = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }
        // 4. 수열의 길이 M
        int M = Integer.parseInt(br.readLine());
        // 5. queuestack에 삽입할 원소를 담고 있는 길이 M인 수열 C
        int[] C = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            C[i] = Integer.parseInt(st.nextToken());
        }

        // 연산 : 수열 C에대하여 queuestack이 출력하는 원소들을 차례로 출력합니다.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            sb.append(queueStack(C[i], A, B, N)).append(" ");
        }

        // 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int queueStack(int x, int[] type, int[] ele, int size){
        for(int i = 0; i < size; i++){
            if(type[i] == 0){
                int temp = x;
                x = ele[i];
                ele[i] = temp;
            }
        }
        return x;
    }
}
