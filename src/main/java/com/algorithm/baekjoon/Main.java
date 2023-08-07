package com.algorithm.baekjoon;

import java.io.*;
import java.util.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        LinkedList<Map<Integer, Integer>> linkedList = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> hm;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 입력
        for (int i = 1; i <= N; i++) {
            hm = new HashMap<>();
            hm.put(i, Integer.parseInt(st.nextToken()));
            linkedList.offer(hm);
        }

        // 펑!
        int index = 0, number;
        while (!linkedList.isEmpty()) {
            while(index < linkedList.size()){
                index %= linkedList.size();
            }
            hm = linkedList.remove(index);
            for (int balloon : hm.keySet()) {
                result.add(balloon);
                number = hm.get(balloon);
                index += number > 0 ? number - 1 : number + linkedList.size();
                break;
            }
        }

        // 출력
        for(int x : result){
            bw.write(x + " ");
        }
        bw.flush();
        bw.close();
    }
}
