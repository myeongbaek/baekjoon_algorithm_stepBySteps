package com.algorithm.baekjoon;

import java.io.*;
import java.util.Arrays;

class ch13_09 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];

        // 입력
        for (int i = 0; i < N; i++){
            array[i] = br.readLine();
        }

        // 정렬
        Arrays.sort(array, (o1, o2) -> {
            if(o1.length() == o2.length()){
                for(int i = 0; i < o1.length(); i++){
                    if(o1.charAt(i) != o2.charAt(i)){
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
            } else{
                return o1.length() - o2.length();
            }
            return 0;
        });

        // 출력
        for(int i = 0; i < N - 1; i++){
            if(!array[i].equals(array[i+1])){
                bw.write(array[i]);
                bw.newLine();
            }
        }
        bw.write(array[N - 1]);
        bw.flush();
        bw.close();
    }
}
