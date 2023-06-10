package com.algorithm.baekjoon.JavaSort;

import java.util.Arrays;

public class Sort02_Selection {
    private static final int ARRAYSIZE = 10;
    private static final int SYSMAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // 선택 정렬 : 각 회전마다 "최솟값을 선택"하여 "정해진 자리"와 교체한다.
        // 시간 복잡도 : O(n^2)
        for (int i = 0; i < ARRAYSIZE; i++) {
            int minValue = SYSMAX;
            int minIndex = i;
            for (int j = i; j < ARRAYSIZE; j++) {
                if(array[j] < minValue){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            swap(i, minIndex, array);
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
