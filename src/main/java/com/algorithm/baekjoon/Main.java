package com.algorithm.baekjoon;

import java.io.*;
import java.util.Stack;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            if (n == 0){
                stack.pop();
            } else {
                stack.push(n);
            }
        }
    }

}
