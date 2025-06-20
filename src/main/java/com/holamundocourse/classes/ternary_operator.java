package com.holamundocourse.classes;

// Scanner is a class from java.util package that allows reading input from various sources
// (keyboard, files, strings). It's commonly used for getting user input from the console.
// The import statement makes this class available for use in the current file.
import java.util.Scanner;

public class ternary_operator {

    public static void main(String[] args) {
        // Option 1: Traditional approach with proper resource management
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read input from the console. It allows us to read various types of input from the user each time we need it.
        System.out.print("Please enter your age: "); // Print a message to the user asking for their age.
        int age = scanner.nextInt(); // Read the user's input and store it in the age variable.
        
        // ADVICE: When to use ternary operator vs if-else statements:
        // - Use ternary operator (?:) for simple, single-line conditional assignments
        //   when both outcomes are simple expressions (like this age check)
        // - Use if-else statements when:
        //   * You have multiple lines of code in each branch
        //   * You need to execute different methods/actions (not just assign values)
        //   * The logic is complex or requires multiple conditions
        //   * You want better readability for complex scenarios
        String message = age >= 18 ? "You are an adult" : "You are a minor"; // Use a ternary operator to determine if the user is an adult or a minor. The ternary operator is a shorthand way to write an if-else statement.
        
        System.out.println(message);
        scanner.close();
        // WARNING: The scanner object must be closed after use to free up resources.
        // If you don't close it, it will cause a resource leak and the program will not work correctly.

        // Option 2: Shorter inline approach (no scanner variable to close)
        // System.out.print("Please enter your age: ");
        // int age = new Scanner(System.in).nextInt();
        // String message = age >= 18 ? "You are an adult" : "You are a minor";
        // System.out.println(message);
        
        // Option 3: Ultra-short one-liner
        // System.out.print("Enter age: "); System.out.println(new Scanner(System.in).nextInt() >= 18 ? "Adult" : "Minor");
    }
}
