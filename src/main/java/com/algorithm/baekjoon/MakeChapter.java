package com.algorithm.baekjoon;

import java.io.File;
import java.io.IOException;

public class MakeChapter {
    private static final int CHAPTER = 10;
    private static final int N = 8;
    private static final String root = System.getProperty("user.dir");
    private static final String path = "\\src\\main\\java\\com\\algorithm\\baekjoon";

    public static void main(String[] args) {
        for(int i = 1; i <= N; i++){
            String filePath = String.format(root + path + "\\ch%02d_%02d.java", CHAPTER, i);
            File file = new File(filePath);
            try{
                if(file.createNewFile()){
                    System.out.println(String.format("File created : ch%02d_%02d", CHAPTER, i));
                } else {
                    System.out.println("File already exists");
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
