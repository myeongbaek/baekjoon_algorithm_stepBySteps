package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.Stack;

class ch16_02 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            if (n == 0){
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        while(!stack.isEmpty()){
            total += stack.pop();
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }

}
