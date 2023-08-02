package com.algorithm.baekjoon.ch14;

import java.util.Scanner;
import java.util.*;

class ch14_08 {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                hm.put(input.substring(i, j + 1), 0);
            }
        }

        List<String> result = new ArrayList<>(hm.keySet());
        System.out.println(result.size());
    }
}
