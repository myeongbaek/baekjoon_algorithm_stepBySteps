package com.algorithm.baekjoon.JavaSort;

import java.util.Arrays;

public class Sort01_Insertion {
    private static final int ARRAYSIZE = 10;

    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // 삽입 정렬 : 앞에서부터 차례로 "이미 정렬된 배열 부분과 비교"하여 자신의 위치에 "삽입"한다.
        // 시간 복잡도 : O(n^2)
        for (int i = 1; i < ARRAYSIZE; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    swap(i, j, array);
                }
            }
        }

        //출력
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
