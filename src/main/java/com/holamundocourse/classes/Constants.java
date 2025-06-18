package com.holamundocourse.classes;

public class Constants {
    // Constants are declared using the 'final' keyword
    // Convention: Constants are typically written in UPPERCASE with underscores
    public static final double PI = 3.14159;
    public static final String GREETING = "Hello, World!";
    public static final int MAX_ATTEMPTS = 3;
    
    public static void main(String[] args) {
        // Using the constants
        System.out.println("Value of PI: " + PI);
        System.out.println("Greeting: " + GREETING);
        
        // Demonstrating that constants cannot be modified
        // The following line would cause a compilation error:
        // PI = 3.14;  // Cannot modify a final variable
        
        // Using constants in calculations
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + ": " + area);
        
        // Using constants in a loop
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            System.out.println("Attempt " + (i + 1) + " of " + MAX_ATTEMPTS);
        }

        // Demonstrating different types of division with variables
        int a = 42;
        int b = 5;
        
        int intResult = a / b;           // Integer division
        float floatResult = a / b;       // Integer division then conversion to float
        double doubleResult = a / (double)b;  // Double division
        float floatResult2 = (float)a / b;    // Float division
        double doubleResult2 = a / (double)b; // Double division
        
        System.out.println("\nDivision examples with a=" + a + " and b=" + b + ":");
        System.out.println("a / b (int) = " + intResult);
        System.out.println("a / b (float) = " + floatResult);
        System.out.println("a / b (double) = " + doubleResult);
        System.out.println("(float)a / b = " + floatResult2);
        System.out.println("a / (double)b = " + doubleResult2);
    }
}
