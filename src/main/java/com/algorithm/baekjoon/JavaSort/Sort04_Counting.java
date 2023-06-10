package com.algorithm.baekjoon.JavaSort;

import java.util.Arrays;

public class Sort04_Counting {
    private static final int ARRAYSIZE = 10;
    private static final int MAXNUMBER = 1000;
    // 원소의 최댓값만큼의 counting 배열을 선언해야 하므로 공간복잡도에서 불리하다.
    // 평균 시간 복잡도가 O(n) 이라는 어마어마한 효율을 지니지만 사실상상QucikSort나 TimSort가 주로 사용되는 이유이다.

    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // 카운팅 정렬, 계수 정렬
        int [] counting = new int[MAXNUMBER];
        int [] result = new int[ARRAYSIZE];
        for(int i = 0; i < ARRAYSIZE; i++){ // 과정 1 : counting
            counting[array[i]]++;
        }
        for(int i = 0; i < MAXNUMBER - 1; i++){ // 과정 2 : 누적합
            counting[i + 1] += counting[i];
        }
        for(int i = 0; i < ARRAYSIZE; i++){ // 과정 3 : 누적합 - 1 위치에 원소를 배치
            result[counting[array[i]] - 1] = array[i];
        }

        //출력
        System.out.println(Arrays.toString(result));
    }
}

