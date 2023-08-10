package com.algorithm.baekjoon;

class Main {
    public static void main(String[] args) {
        // 성능 측정
        long startTime, endTime, time, result;

        final long N = 20;
        // 1. 팩토리얼 : n! = 1 * 2 * ... * n
        // 1-1. 재귀
        // 동작원리 : 함수 호출 스택에 차례대로 쌓인 후 종료 조건에 도달하면
        // 가장 위에서부터 차례대로 곱한 값을 처리하며 반환한다. 이렇게 맨 마지막에는 n! 값을 반환한다.
        startTime = System.nanoTime();
        result = factorialRecursive(N);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Recursive Factorial : answer = " + result + ", time = " + time + "ns");


        // 1-2. for 문
        result = 1L;
        startTime = System.nanoTime();
        for(long i = 1; i <= N; i++){
            result *= i;
        }
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Factorial using FOR : answer = " + result + ", time = " + time + "ns");


        // 2. 이항 계수 : 두 개의 항을 전개하여 계수를 나타낸 것.
        // ex) (a + b)^n을 전개하면 나오는 항들의 계수를 구하는 식으로서 a^(n-r)b^r에 대한 계수를 구할 수 있다.
        // 이는 a, b의 조합되어 나온 값이다. b가 n개 있을 때 이들 중 r개를 뽑는 조합 공식이다.
        // 즉, 이항 계수는 nCr의 조합 공식이다.
        // nCr = n! / r!(n-r)!

        // 2-1. 재귀 : nCr = n-1Cr-1 + n-1Cr
        int n = 5, r = 2, answer;
        startTime = System.nanoTime();
        answer = binomialCoefficientRecursive(n, r);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Binomial Coefficient recursive : answer = " + answer + ", time = " + time + "ns");

        // 2-2. 동적 계획법 : memoization
        startTime = System.nanoTime();
        int[][] memo = new int[n + 1][r + 1];
        answer = binomialCoefficientMemoization(n, r, memo);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Binomial Coefficient using memoization and recursion: answer = " + answer + ", time = " + time + "ns");

        // 2-3. 팩토리얼, 동적계획법
        startTime = System.nanoTime();
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for(int i = 1; i <= n; i++){
            factorial[i] = i * factorial[i - 1];
        }
        answer = factorial[n] / (factorial[r] * factorial[n - r]);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Binomial Coefficient using factorial memoization : answer = " + answer + ", time = " + time + "ns");




    }

    private static int binomialCoefficientMemoization(int n, int k, int[][] bc) {
        if(bc[n][k] > 0){
            return bc[n][k];
        } else if(n == k || k == 0){
            bc[n][k] = 1;
            return 1;
        } else {
            bc[n][k] = binomialCoefficientMemoization(n - 1, k - 1, bc) + binomialCoefficientMemoization(n - 1, k, bc);
            return bc[n][k];
        }
    }

    public static int binomialCoefficientRecursive(int n, int k){
        if(n == k || k == 0){
            return 1;
        } else {
            return binomialCoefficientRecursive(n - 1, k - 1) + binomialCoefficientRecursive(n - 1, k);
        }
    }

    public static long factorialRecursive(long n) {
        if(n <= 1){
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
