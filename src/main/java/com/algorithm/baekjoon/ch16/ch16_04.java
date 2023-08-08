package com.algorithm.baekjoon.ch16;

import java.io.*;
import java.util.Stack;

class ch16_04 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        while(!line.equals(".")){
            bw.write(checkLine(line));
            bw.newLine();
            line = br.readLine();
        }
        bw.flush();
        bw.close();
    }
    public static String checkLine(String line){
        char[] charArray = line.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : charArray){
            if(ch == '('){
                stack.push('(');
            } else if(ch == ')'){
                if(!stack.isEmpty()){
                    if(stack.pop() != '('){
                        return "no";
                    }
                } else {
                    return "no";
                }
            } else if(ch == '['){
                stack.push('[');
            } else if(ch == ']'){
                if(!stack.isEmpty()){
                    if(stack.pop() != '['){
                        return "no";
                    }
                } else {
                    return "no";
                }
            }
        }
        if(!stack.isEmpty()){
            return "no";
        } else {
            return "yes";
        }
    }
}
