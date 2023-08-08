package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Deque;

class ch16_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();


        // 입력, 연산, 출력
        for (int i = 0; i < N; i++) {
            String[] operation = br.readLine().split(" ");
            if (Objects.equals(operation[0], "push")) {
                queue.offer(Integer.parseInt(operation[1]));
            } else if (Objects.equals(operation[0], "pop")) {
                if (!queue.isEmpty()) {
                    bw.write(String.valueOf(queue.poll()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            } else if (Objects.equals(operation[0], "size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
            } else if (Objects.equals(operation[0], "empty")) {
                if(queue.isEmpty()){
                    bw.write(String.valueOf(1));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                }
            } else if (Objects.equals(operation[0], "front")) {
                if(!queue.isEmpty()){
                    bw.write(String.valueOf(queue.peek()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            } else if (Objects.equals(operation[0], "back")) {
                if(!queue.isEmpty()){
                    bw.write(String.valueOf(queue.peekLast()));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                }
            }
        }

        bw.flush();
        bw.close();
    }

}
