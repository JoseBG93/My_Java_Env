package com.myjavaenv.Exercises;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /**
         * Create a calculator that
         * takes two number and then print
         * the result of the sum, subtraction,
         */
    
    // Read the first number
    System.out.println("Enter the first number: ");
    Scanner number1 = new Scanner(System.in);
    byte firstNumber = number1.nextByte();
    number1.close();

    // Read the second number
    Scanner number2 = new Scanner(System.in);
    System.out.println("Enter the second number: ");
    byte secondNumber = number2.nextByte();
    number2.close();

    // Perform calculations
    byte sum = (byte)(firstNumber + secondNumber);
    System.out.println("The sum is: " + sum);
    System.out.println("The result of the subtraction is: " + (firstNumber - secondNumber));
    System.out.println("The result of the multiplication is: " + (firstNumber * secondNumber));
    System.out.println("The result of the division is: " + (firstNumber / secondNumber));
    }
}