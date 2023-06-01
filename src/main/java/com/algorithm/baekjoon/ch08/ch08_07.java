package com.algorithm.baekjoon.ch08;

import java.io.*;
import java.util.StringTokenizer;

class ch08_07 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        // 달팽이는 낮에 높이 V에 도달하거나 밤에 높이 V에 도달한다.
        // 항상 낮보다 밤에 올라가는 높이가 크다.
        // 만약 낮에 높이 V에 도달하면 미끄러져 내려오지 않는다.
        // 올라가는 횟수는 내려가는 횟수보다 항상 하나 더 크다.

        // 만약 달팽이가 올라가는데 필요한 날 수를 V / (A - B)라고 할 경우
        // 입력 : 2, 1, 5 출력 : 4가 아닌 5가 나온다.
        // 4일 째에 높이 5에 도달하고도 미끄러져 내려왔기 때문이다.
        // 따라서 필요한 날짜 수를 (V - B) / (A - B)라 한다.
        // 또한 나머지가 있는 경우 올림을 해주어야 한다.
        int date = (V - B) / (A - B);
        if((V - B) % (A - B) != 0){
            date++;
        }

        bw.write(String.valueOf(date));
        bw.flush();
        bw.close();
    }

}
