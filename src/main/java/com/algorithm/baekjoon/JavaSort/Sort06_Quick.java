package com.algorithm.baekjoon.JavaSort;

import java.util.Arrays;

public class Sort06_Quick {
    private static final int ARRAYSIZE = 10;

    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // Binary Search Tree : 이진탐색트리

        //출력
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
