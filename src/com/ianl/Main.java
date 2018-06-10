package com.ianl;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(sumDigits(146469182));
//        System.out.println(sumDigits(-100020005));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-120021));
        System.out.println(isPalindrome(12340));
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

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while(number!=0){
            reversedNumber*=10;
            reversedNumber+=(number%10);
            number/=10;
        }
        //System.out.println("ReversedNumber: "+ reversedNumber);
        return originalNumber == reversedNumber;
    }
}
