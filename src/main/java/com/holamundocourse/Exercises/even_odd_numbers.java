package com.holamundocourse.Exercises;

import java.util.Scanner;

public class even_odd_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an EVEN number.");
                break;
            default:
                System.out.println(number + " is an ODD number.");
        }

        switch (number % 3) {
            case 0:
                System.out.println(number + " is divisible by 3.");
                break;
            default:
                System.out.println(number + " is NOT divisible by 3.");
        }

        switch (number % 4) {
            case 0:
                System.out.println(number + " is divisible by 4.");
                break;
            default:
                System.out.println(number + " is NOT divisible by 4.");
        }

        // && is the logical AND operator. It checks if both conditions are true. It can't be used in a switch statement.
        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println(number + " is divisible by both 3 and 4.");
        } else {
            System.out.println(number + " is NOT divisible by both 3 and 4.");
        }

        System.out.println("\n--- Alternative ways to use && logic in switch ---");

        // Method 1: Convert boolean expressions to integer values
        int combinedResult = (number % 3 == 0 ? 1 : 0) + (number % 4 == 0 ? 2 : 0);
        switch (combinedResult) {
            case 0:  // Neither divisible by 3 nor 4
                System.out.println("Method 1: Not divisible by 3 or 4");
                break;
            case 1:  // Only divisible by 3
                System.out.println("Method 1: Only divisible by 3");
                break;
            case 2:  // Only divisible by 4
                System.out.println("Method 1: Only divisible by 4");
                break;
            case 3:  // Divisible by both (1 + 2 = 3)
                System.out.println("Method 1: Divisible by both 3 and 4");
                break;
        }

        // Method 2: Using a custom function that returns a code
        switch (getDivisibilityCode(number)) {
            case "00":
                System.out.println("Method 2: Not divisible by 3 or 4");
                break;
            case "10":
                System.out.println("Method 2: Only divisible by 3");
                break;
            case "01":
                System.out.println("Method 2: Only divisible by 4");
                break;
            case "11":
                System.out.println("Method 2: Divisible by both 3 and 4");
                break;
        }

        // Method 3: Using boolean to string conversion
        String booleanCombination = (number % 3 == 0) + "_" + (number % 4 == 0);
        switch (booleanCombination) {
            case "false_false":
                System.out.println("Method 3: Not divisible by 3 or 4");
                break;
            case "true_false":
                System.out.println("Method 3: Only divisible by 3");
                break;
            case "false_true":
                System.out.println("Method 3: Only divisible by 4");
                break;
            case "true_true":
                System.out.println("Method 3: Divisible by both 3 and 4");
                break;
        }

        scanner.close();
    }

    // Helper method for Method 2
    public static String getDivisibilityCode(int num) {
        String divisibleBy3 = (num % 3 == 0) ? "1" : "0";
        String divisibleBy4 = (num % 4 == 0) ? "1" : "0";
        return divisibleBy3 + divisibleBy4;
    }
}