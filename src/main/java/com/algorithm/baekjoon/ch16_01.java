package com.algorithm.baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

class ch16_01 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            switch (n) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        bw.write(String.valueOf(stack.pop()));
                        bw.newLine();
                    } else {
                        bw.write(String.valueOf(-1));
                        bw.newLine();
                    }
                    break;
                case 3:
                    bw.write(String.valueOf(stack.size()));
                    bw.newLine();
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        bw.write(String.valueOf(1));
                        bw.newLine();
                    } else {
                        bw.write(String.valueOf(0));
                        bw.newLine();
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        bw.write(String.valueOf(stack.peek()));
                        bw.newLine();
                    } else {
                        bw.write(String.valueOf(-1));
                        bw.newLine();
                    }
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
