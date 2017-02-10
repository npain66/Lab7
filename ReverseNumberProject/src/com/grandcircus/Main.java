package com.grandcircus;

public class Main {

    public static void main(String[] args) {
	// Original number
        int number = 9876;
        int reversedNumber = 0;
        int temp = 0;

        while(number > 0){

           //use modulus operator to strip off the last digit
            temp = number%10;

           //create the reversed number
           reversedNumber = reversedNumber * 10 + temp;
           number = number/10;

        }

        //output the reversed number
        System.out.println("Reversed Number is" + reversedNumber);

    }
}
