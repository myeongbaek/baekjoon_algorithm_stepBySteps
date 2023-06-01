package com.algorithm.baekjoon.ch06;

import java.io.*;
import java.util.StringTokenizer;

class ch06_09 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    private static final int MAJOR = 20;

    public static void main(String[] args) throws IOException {

        // 전공과목별합(학점 * 과목평점)
        // 학점의 총합
        // 정공평점 = 전공과목별합 / 학점의 총합
        int totalCredit = 0;
        float totalGradePerSubject = 0;
        for (int i = 0; i < MAJOR; i++) {
            st = new StringTokenizer(br.readLine());
            String major = st.nextToken();

            float credit = Float.parseFloat(st.nextToken());
            String[] grade = st.nextToken().split("");

            if(!grade[0].equals("P")) {
                totalGradePerSubject += point(credit, grade);
                totalCredit += credit;
            }
        }
        bw.write(String.format("%.6f", totalCredit == 0 ? 0 : totalGradePerSubject / totalCredit));
        bw.flush();
        bw.close();
    }

    private static float point(float credit, String[] grade) {
        if (grade[0].equals("F")){
            return 0;
        }
        int score = (int)'E' - (int)grade[0].charAt(0);
        return grade[1].equals("+")? (score + 0.5f) * credit : score * credit;
    }

}
