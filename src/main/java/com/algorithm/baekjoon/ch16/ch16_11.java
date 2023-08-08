package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class ch16_11 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Deque<Integer> deq = new ArrayDeque<>();

        // 입력 1~5
        // 1. 갯수 N
        int N = Integer.parseInt(br.readLine());
        // 2. 길이가 N인 수열 A에 대하여 0 이면 큐, 1이면 스택
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 길이가 N인 수열 B에 대하여 원소를 입력으로 받는다.
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());
            if (A[i] == 0) {
                deq.offer(b);
            }
        }
        // 4. 수열의 길이 M
        int M = Integer.parseInt(br.readLine());
        // 5. queuestack에 삽입할 원소를 담고 있는 길이 M인 수열 C
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            deq.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(deq.pollLast()).append(" ");
        }

        // 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
