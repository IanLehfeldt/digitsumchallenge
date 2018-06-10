package com.ianl;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sumDigits(146469182));
//        System.out.println(sumDigits(-100020005));
//        System.out.println(isPalindrome(1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(-120021));
//        System.out.println(isPalindrome(12340));
//        System.out.println(firstLastDigitSum(2008));
//        System.out.println(firstLastDigitSum(156789));
//        System.out.println(firstLastDigitSum(2200));
//        System.out.println(firstLastDigitSum(9));
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(1000));
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(9, 99));
//        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

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

    public static int getEvenDigitSum(int number) {
        if(number >= 0) {
            int sumOfEvenNumbers = 0;
            while(number >= 1) {
                if(number%2==0) {
                    sumOfEvenNumbers+=(number%10);
                }
                number/=10;
            }
            return sumOfEvenNumbers;
        }
        return -1;
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if((numberOne>=10&&numberOne<=99)&&(numberTwo>=10&&numberTwo<=99)){
            int digitOne = numberOne/10;
            int digitTwo = numberOne%10;
            int digitThree = numberTwo/10;
            int digitFour = numberTwo%10;
            if (((digitOne == digitThree)||(digitOne == digitFour))||((digitTwo == digitThree)||(digitTwo == digitFour))){
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if ((numberOne>=10&&numberOne<=1000)&&(numberTwo>=10&&numberTwo<=1000)&&(numberThree>=10&&numberThree<=1000)) {
            int lastDigitOne = numberOne%10;
            int lastDigitTwo = numberTwo%10;
            int lastDigitThree = numberThree%10;
            if((lastDigitOne == lastDigitTwo)||(lastDigitOne == lastDigitThree)||(lastDigitTwo == lastDigitThree)) {
                return true;
            }
        }
        return false;
    }
}
