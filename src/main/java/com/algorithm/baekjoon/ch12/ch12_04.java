package com.algorithm.baekjoon.ch12;

import java.io.*;
import java.util.StringTokenizer;

class ch12_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        final int ROW = Integer.parseInt(st.nextToken());
        final int COL = Integer.parseInt(st.nextToken());
        final int BOARD_SIZE = 8;
        // 보드 색깔 정보 불러오기
        char[][] board = new char[ROW][COL];
        for (int r = 0; r < ROW; r++) {
            String str = br.readLine();
            for (int c = 0; c < COL; c++) {
                char ch = str.charAt(c);
                board[r][c] = ch;
            }
        }

        // 보드를 8 * 8 체스판으로 자른 후 색깔을 칠한다. 이 때, 가장 색깔을 적게 칠하는 경우를 구한다.
        int result = 100;
        for (int i = 0; i <= ROW - BOARD_SIZE; i++) {
            for (int j = 0; j <= COL - BOARD_SIZE; j++) {
                int toPaint1 = 0; // 짝수에 B
                int toPaint2 = 0; // 짝수에 W
                for (int r = i; r < i + BOARD_SIZE; r++) {
                    for (int c = j; c < j + BOARD_SIZE; c++) {
                        char ch = board[r][c];
                        // 칠해야 할 갯수를 센다.
                        if((r + c - i - j) % 2 == 0){
                            if(ch == 'B'){
                                toPaint2++;
                            } else{
                                toPaint1++;
                            }
                        } else{
                            if(ch == 'W'){
                                toPaint2++;
                            } else{
                                toPaint1++;
                            }
                        }
                    }
                }
                result = Math.min(result, Math.min(toPaint1, toPaint2));
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}

