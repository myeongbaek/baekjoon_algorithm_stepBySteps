package com.algorithm.baekjoon.ch10;

import java.io.*;
import java.util.StringTokenizer;

class ch10_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int total = 0;
        int[] angles = new int[3];
        for(int i = 0; i < 3; i++){
            int angle = Integer.parseInt(br.readLine());
            angles[i] = angle;
            total += angle;
        }
        if(total != 180){
            bw.write("Error");
        } else{
            if(angles[0] == angles[1] && angles[1] == angles[2]){
                bw.write("Equilateral");
            } else if(angles[0] == angles[1] || angles[1] == angles[2] || angles[0] == angles[2]){
                bw.write("Isosceles");
            } else{
                bw.write("Scalene");
            }
        }
        bw.flush();
        bw.close();
    }
}
