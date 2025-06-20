package com.holamundocourse.Exercises;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("This is a calculator application");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();
    
    double sum = num1 + num2;
    
    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    
    scanner.close();
    }
}
