package com.holamundocourse.classes;

public class mathClass {
    public static void main(String[] args) {
        // Basic math operations using Math class
        double num1 = 25.0;
        double num2 = 4.0;
        
        // Square root
        System.out.println("Square root of " + num1 + " = " + Math.sqrt(num1));
        
        // Power
        System.out.println(num1 + " raised to power " + num2 + " = " + Math.pow(num1, num2));
        
        // Absolute value
        System.out.println("Absolute value of -15 = " + Math.abs(-15));
        
        // Rounding
        System.out.println("Round 3.7 = " + Math.round(3.7));
        System.out.println("Ceiling of 3.2 = " + Math.ceil(3.2));
        System.out.println("Floor of 3.7 = " + Math.floor(3.7));
        
        // Random number between 0 and 1
        System.out.println("Random number: " + Math.random());
        System.out.println("Random number between 0 and 100: " + (int)(Math.random() * 100));
        
        // Maximum and minimum
        System.out.println("Maximum of 10 and 20 = " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20 = " + Math.min(10, 20));
    }
}
