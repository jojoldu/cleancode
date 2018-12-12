package com.jojoldu.youtube.cleancode.chap2;

/**
 * Created by jojoldu@gmail.com on 2018-12-12
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class Example15 {


    public void printNumber (String firstNumber, String middleNumber, String lastNumber) {
        String number = firstNumber +"-"+middleNumber +"-" + lastNumber;
        System.out.println(number);
    }




    public static class MobileNumber {
        private String firstNumber;
        private String middleNumber;
        private String lastNumber;

        public MobileNumber(String firstNumber, String middleNumber, String lastNumber) {
            this.firstNumber = firstNumber;
            this.middleNumber = middleNumber;
            this.lastNumber = lastNumber;
        }

        public String getFullNumber () {
            return firstNumber +"-"+middleNumber +"-" + lastNumber;
        }
    }
}
