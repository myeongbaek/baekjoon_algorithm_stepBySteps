package com.algorithm.baekjoon.ch09;

import java.io.*;
import java.util.ArrayList;

class ch09_06 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> primeNumbers = getPrimeNumber(N);
        while(N > 1){
            for(int i = 0; i < primeNumbers.size(); i++){
                int p = primeNumbers.get(i);
                if(N % p == 0){
                    bw.write(p + "\n");
                    N /= p;
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }

    private static ArrayList<Integer> getPrimeNumber(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[1] = true;
        for(int i = 2; i <= n; i++){
            if(isNotPrime[i]){
                continue;
            }
            for(int j = i * 2; j <= n; j += i){
                isNotPrime[j] = true;
            }
            primeNumbers.add(i);
        }
        return primeNumbers;
    }

}
