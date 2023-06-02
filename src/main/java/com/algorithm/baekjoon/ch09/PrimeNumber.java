package com.algorithm.baekjoon.ch09;

// 소수란 1과 자기 자신만을 약수로 가지는 수 이다.
// 약수 : 어떤 자연수를 나눠 나머지가 0으로 만드는 수
// 에라토스테네스의 체 : 소수의 배수가 되는 수를 모두 지운다.
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(getPrime(10000));
        System.out.println(getPrimeE(10000000));
    }
    // 소수의 갯수를 구한다.
    public static int getPrime(int n) {
        int cnt = 0;
        // n이하 자연수 중 소수의 갯수를 파악한다.
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            // 1과 자기자신 외에 나누어 떨어질 경우 소수가 아니다.
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }
        return cnt;
    }
    public static int getPrimeE(int n) {
        int cnt = 0;
        boolean[] isNotPrime = new boolean[n + 1];

        for(int i = 2; i <= n; i++){
            if(isNotPrime[i] == false){
                cnt++;
            }
            // 소수 i의 배수는 소수가 아니다.
            for(int j = i * 2; j <= n; j += i){
                isNotPrime[j] = true;
            }
        }
        return cnt;
    }
}
