package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s1 = Integer.parseInt(reader.readLine());
        int s2 = Integer.parseInt(reader.readLine());
        int s3 = Integer.parseInt(reader.readLine());
        if (s1 == s2 && s1 == s3) {
            System.out.println(s1 + " " + s2 + " " + s3);
        } else {
            if (s1 == s2) {
                System.out.println(s1 + " " + s2);
            } else {
                if (s1 == s3) {
                    System.out.println(s1 + " " + s3);
                } else {
                    if (s2 == s3) {
                        System.out.println(s2 + " " + s3);
                    }
                }
            }
        }
    }
}