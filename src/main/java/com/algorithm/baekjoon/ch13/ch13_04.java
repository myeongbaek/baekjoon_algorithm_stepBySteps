package com.algorithm.baekjoon.ch13;

import java.io.*;
import java.util.StringTokenizer;

class ch13_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        //입력
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] tmp = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 안정 정렬이면서도 시간복잡도가 O(nlogn)인 합병정렬로 해결해 보겠다.
        mergeSort(numbers, 0, N - 1, tmp);


        // 출력
        StringBuilder sb = new StringBuilder();
        for (int n : numbers) {
            sb.append(n + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void mergeSort(int[] arr, int start, int end, int[] tmp) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid, tmp);
            mergeSort(arr, mid + 1, end, tmp);
            merge(arr, start, mid, end, tmp);
        }

    }

    private static void merge(int[] arr, int start, int mid, int end, int[] tmp) {
        int l = start;
        int r = mid + 1;
        int idx = start;
        // 정복
        while ((l <= mid) && (r <= end)) {
            if (arr[l] <= arr[r]) {
                tmp[idx++] = arr[l++];
            } else {
                tmp[idx++] = arr[r++];
            }
        }
        // 남은 값을 일괄복사
        if (l > mid) {
            for (int i = r; i <= end; i++) {
                tmp[idx++] = arr[i];
            }
        } else {
            for (int i = l; i <= mid; i++) {
                tmp[idx++] = arr[i];
            }
        }
        // 재복사
        for (int i = start; i <= end; i++) {
            arr[i] = tmp[i];
        }
    }
}

