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
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        // 순서
        int order = 1;
        while (!queue.isEmpty()) {
            if(queue.peek() == order){
                queue.poll();
                order++;
            } else if(!stack.isEmpty() && stack.peek() == order){
                stack.pop();
                order++;
            } else {
                stack.push(queue.poll());
            }
        }
        boolean isNice = true;
        while(!stack.isEmpty()){
            if(stack.peek() == order){
                stack.pop();
                order++;
            } else {
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
