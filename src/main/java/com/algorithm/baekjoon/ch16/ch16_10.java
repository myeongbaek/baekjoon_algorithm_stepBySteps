package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class ch16_10 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Deque<int[]> deq = new ArrayDeque<>();

        // 입력
        for (int i = 0; i < N; i++) {
            deq.add(new int[]{
                    i + 1, // 풍선 idx
                    Integer.parseInt(st.nextToken()) // 내용 숫자
            });
        }

        // 펑!
        while (deq.size() > 1) {
            int[] balloon = deq.poll();
            sb.append(balloon[0]).append(" ");
            int move = balloon[1];
            if(move < 0){ // 뒤로 돌리기
                while(move++ < 0)
                    deq.addFirst(deq.pollLast());
            } else { // 앞으로 돌리기
                move--;
                while(move-- > 0)
                    deq.addLast(deq.pollFirst());
            }
        }

        // 출력
        bw.write(sb.append(deq.poll()[0]).toString());
        bw.flush();
        bw.close();
    }
}
