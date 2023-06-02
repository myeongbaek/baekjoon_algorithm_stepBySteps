package com.algorithm.baekjoon.ch09;

import java.io.*;

class ch09_03 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(n);
            int sum = 0;
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    sum += i;
                    sb.append(" ");
                    sb.append(i);
                }
            }
            if(sum == n){
                String st = sb.toString();
                st = st.replaceAll("\\s", " + ");
                st = st.replaceFirst("\\+", "=");
                bw.write(st);
            } else{
                bw.write(String.format("%d is NOT perfect.", n));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
