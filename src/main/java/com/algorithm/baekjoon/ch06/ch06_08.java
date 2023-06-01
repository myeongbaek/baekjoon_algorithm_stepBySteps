package com.algorithm.baekjoon.ch06;

import java.io.*;

class ch06_08 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check()) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    private static boolean check() throws IOException {
        boolean[] alphabet = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            // 이전 글자와 현재 글자가 다를 때,
            if (prev != now) {
                // 아직 등장하지 않은 글자라면 true
                if (!alphabet[now - 'a']) {
                    alphabet[now - 'a'] = true;
                    prev = now;
                } else { // 이전에 등장했던 글자라면 return false
                    return false;
                }
            }
        }
        return true;
    }
}
