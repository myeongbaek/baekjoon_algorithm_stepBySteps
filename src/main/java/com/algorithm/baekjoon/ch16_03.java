package com.algorithm.baekjoon;

import java.io.*;
import java.util.Stack;

class ch16_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] PS = br.readLine().toCharArray();
            for (char ch : PS) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push('0');
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                bw.write("NO");
                bw.newLine();
            } else {
                bw.write("YES");
                bw.newLine();
            }
            stack.clear();
        }
        bw.flush();
        bw.close();
    }
}
