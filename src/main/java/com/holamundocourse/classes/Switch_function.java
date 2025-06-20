package com.holamundocourse.classes;

import java.util.Scanner;

public class Switch_function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        // SWITCH STATEMENT EXPLANATION:
        // A switch statement is a control flow statement that allows you to execute different blocks of code
        // based on the value of a variable or expression. It's an alternative to multiple if-else statements
        // when you need to compare a single variable against multiple constant values.
        //
        // HOW IT WORKS:
        // 1. The switch expression (day) is evaluated once
        // 2. The value is compared with each case label (1, 2, 3, etc.)
        // 3. If a match is found, the corresponding code block executes
        // 4. The 'break' statement exits the switch block (prevents fall-through to next cases)
        // 5. If no match is found, the 'default' case executes (optional)
        //
        // ADVANTAGES:
        // - More readable than multiple if-else statements
        // - Better performance for multiple conditions
        // - Cleaner code structure
        //
        // IMPORTANT NOTES:
        // - Always use 'break' statements to prevent unintended fall-through
        // - The 'default' case handles unexpected values
        // - Switch works with: byte, short, char, int, String, and enum types
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
        
        scanner.close();
    }
}
