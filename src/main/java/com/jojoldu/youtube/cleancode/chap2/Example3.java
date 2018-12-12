package com.jojoldu.youtube.cleancode.chap2;

/**
 * Created by jojoldu@gmail.com on 2018-12-12
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Example3 {

    public static void copyChars(char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }





    public static void solveCopyChars(char source[], char destination[]) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
