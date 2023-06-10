package com.algorithm.baekjoon.JavaSort;

import java.util.Arrays;

public class Sort03_Bubble {
    private static final int ARRAYSIZE = 10;
    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // 버블 정렬 : 거품이 위로 올라가듯 각 회전마다 가장 큰 자료가 맨 뒤로 올라간다.
        // 시간 복잡도 : O(n^2)
        for(int i = 0; i < ARRAYSIZE - 1; i++){
            for(int j = 0; j < ARRAYSIZE - i - 1; j++){
                if(array[j] > array[j+1]){
                    swap(j, j+1, array);
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

