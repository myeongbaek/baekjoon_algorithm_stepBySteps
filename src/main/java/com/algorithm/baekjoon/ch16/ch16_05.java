package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.*;
class ch16_05 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> currentLine = new LinkedList<>();
        Stack<Integer> reservedLine = new Stack<>();

        // 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            currentLine.offer(Integer.parseInt(st.nextToken()));
        }

        // 배부
        int order = 1;
        while(!currentLine.isEmpty()){
            if(currentLine.peek() == order){
                currentLine.poll();
                order++;
            } else if(!reservedLine.isEmpty() && reservedLine.peek() == order){
                reservedLine.pop();
                order++;
            } else {
                reservedLine.push(currentLine.poll());
            }
        }

        // 검사
        boolean check = true;
        while(!reservedLine.isEmpty()){
            if(reservedLine.peek() == order){
                reservedLine.pop();
                order++;
            } else {
                check = false;
                break;
            }
        }

        // 출력
        if(check){
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
    }
}
