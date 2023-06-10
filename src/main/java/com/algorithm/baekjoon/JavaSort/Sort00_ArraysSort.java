package com.algorithm.baekjoon.JavaSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort00_ArraysSort {
    private static final int ARRAYSIZE = 10;

    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // 정렬
        // dual-pivot Quicksort 알고리즘
        // 시간복잡도 : 최선 O(nlogn), 최악 O(n^2)
        Arrays.sort(array);

        //출력
        System.out.println(Arrays.toString(array));
    }
}
