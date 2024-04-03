package com.algorithm.baekjoon.ch15;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ch15_08{
    // 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
    //짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다. 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int T = Integer.parseInt(br.readLine());

        // 소수가 false인 배열 - 에라토스테네스의 체
        boolean[] primeNumbers = new boolean[1000001];
        primeNumbers[0] = primeNumbers[1] = true;
        for(int i = 2; i <= Math.sqrt(1000000); i++) {
            if (!primeNumbers[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    primeNumbers[j] = true;
                }
            }
        }

        // 골든바흐 추축
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int j = 2; j <= N / 2; j++){
                if(!primeNumbers[j] && !primeNumbers[N - j]){
                    cnt++;
                }
            }
            bw.write(String.valueOf(cnt));
            bw.newLine();
        }

        // 출력
        bw.flush();
        bw.close();
    }
}