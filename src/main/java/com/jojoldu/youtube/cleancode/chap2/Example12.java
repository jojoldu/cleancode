package com.jojoldu.youtube.cleancode.chap2;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018-12-12
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Example12 {

    public String add (String firstName, String lastName) {
        return firstName+ lastName +"님 안녕하세요";
    }


    private String firstName;

    // 이것도 add?
    public void add(String lastName) {
        this.firstName += lastName;
    }




    public void append(String lastName) {
        this.firstName += lastName;
    }
}
