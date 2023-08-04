package com.algorithm.baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int order = 1;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            if(n == order){
                order++;
            } else {
                stack.push(n);
            }
        }
        while(!stack.isEmpty()){
            if(stack.pop() == order){
                order++;
            } else {
                bw.write("Sad");
                break;
            }
        }
        if(stack.isEmpty() && order == N + 1){
            bw.write("Nice");
        }
        bw.flush();
        bw.close();
    }
}
