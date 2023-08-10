package com.algorithm.baekjoon;

class Main {
    public static void main(String[] args) {
        // 성능 측정
        long startTime, endTime, time, result;

        final long N = 20;
        // 1. 재귀
        // 동작원리 : 함수 호출 스택에 차례대로 쌓인 후 종료 조건에 도달하면
        // 가장 위에서부터 차례대로 곱한 값을 처리하며 반환한다. 이렇게 맨 마지막에는 n! 값을 반환한다.
        startTime = System.nanoTime();
        result = factorialRecursive(N);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Recursive Factorial : answer = " + result + ", time = " + (double) time / 100 + "us");
        // 2.
    }

    public static long factorialRecursive(long n) {
        if(n <= 1){
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
