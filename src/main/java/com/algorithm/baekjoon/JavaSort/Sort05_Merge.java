package com.algorithm.baekjoon.JavaSort;

import java.util.Arrays;

public class Sort05_Merge {
    private static final int ARRAYSIZE = 10;

    public static void main(String[] args) {
        // 입력 [10, 9, 8, ... , 1]
        int[] array = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            array[i] = ARRAYSIZE - i;
        }

        // 합병 정렬 (안정정렬) : 순환 호출 과정에서 분할 정복이 이루어지며 정렬 된다.
        int[] temp = new int[ARRAYSIZE];
        mergeSort(0, ARRAYSIZE - 1, array, temp);


        //출력
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int start, int end, int[] arr, int[] tmp) {
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(start, mid, arr, tmp);
            mergeSort(mid + 1, end, arr, tmp);
            merge(start, mid, end, arr, tmp);
        }
    }

    private static void merge(int start, int mid, int end, int[] arr, int[] tmp) {
        int l = start; // 왼쪽 부분 리스트의 시작점
        int r = mid + 1; // 오른쪽 부분 리스트의 시작점
        int idx = start; // 채워 넣을 위치

        while(l <= mid || r <= end){
            // 두 번째 분할에서 모든 원소를 다 가져왔거나
            // 첫 번째 분할에서 가져오지 않은 원소가 있고 남은 첫 번째 분할의 첫 째 원소가 두 번째 분할의 첫 째 원소보다 작은 경우
            if(r > end || (l <= mid && arr[l] < arr[r])){
                tmp[idx++] = arr[l++];
            } else{
                tmp[idx++] = arr[r++];
            }
        }

        for(int i = start; i <= end; i++){
            arr[i] = tmp[i];
        }
    }
}

