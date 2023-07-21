package com.algorithm.baekjoon;

import java.io.*;
import java.util.*;

class ch13_11 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] result = new int[N];
        HashSet<Integer> hs = new HashSet<>();
        //입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
            hs.add(array[i]);
        }
        //압축
        ArrayList<Integer> soredArray = new ArrayList<>(hs);
        Collections.sort(soredArray);


        for(int i = 0; i < N; i++){
            for(int j = 0; j < soredArray.size(); j++){
                if(array[i] <= soredArray.get(j)){
                    result[i] = j;
                    break;
                }
            }
        }

        //출력
        for(int i = 0; i < N; i++){
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
