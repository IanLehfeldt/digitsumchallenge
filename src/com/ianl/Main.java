package com.ianl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(146469182));
        System.out.println(sumDigits(-100020005));
    }

    public static int sumDigits(int number) {
        int sumOfAllDigits = 0;
        if(number>=10) {
            while(number>0){
                sumOfAllDigits = sumOfAllDigits + (number % 10);
                number/=10;
            }
            return sumOfAllDigits;
        }
        return -1;
    }
}
