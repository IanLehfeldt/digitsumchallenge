package com.ianl;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sumDigits(146469182));
//        System.out.println(sumDigits(-100020005));
//        System.out.println(isPalindrome(1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(-120021));
//        System.out.println(isPalindrome(12340));
        System.out.println(firstLastDigitSum(2008));
        System.out.println(firstLastDigitSum(156789));
        System.out.println(firstLastDigitSum(2200));
        System.out.println(firstLastDigitSum(9));

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

    public static int firstLastDigitSum(int number) {
        if(number >= 0) {
            int firstNumber = number;
            int lastNumber = number%10;

            while(number >= 10) {
                number/=10;
                firstNumber = number;
            }
            return firstNumber + lastNumber;
        }
        return -1;
    }
}
