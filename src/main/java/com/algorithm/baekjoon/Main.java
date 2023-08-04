package com.algorithm.baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 입력
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            queue.offer(number);
        }

        // 순서
        int order = 1;
        while (!queue.isEmpty()) {
            int number = queue.poll();
            if(order == number){
                order++;
            } else {
                stack.push(number);
            }
        }

        // 검사
        boolean isNice = true;
        while(!stack.isEmpty()){
            int number = stack.pop();
            if(order == number){
                order++;
            } else{
                isNice = false;
                break;
            }
        }

        // 출력
        if (isNice) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
    }
}
