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
        int cnt = 1;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            if(n == cnt){
                cnt++;
            } else {
                stack.push(n);
            }
        }
        while(!stack.isEmpty() && cnt <= N){
            if(stack.pop() != cnt){
                bw.write("Sad");
                break;
            } else {
                cnt++;
            }
        }
        if(stack.isEmpty()){
            bw.write("Nice");
        }
        bw.flush();
        bw.close();
    }
}
