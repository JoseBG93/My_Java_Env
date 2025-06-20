package com.holamundocourse.classes;

public class for_statement {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jim", "Jill"};
        
        System.out.println("=== Example 1: Enhanced For Loop (for-each) ===");
        // Enhanced for loop - cleaner and more readable
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
        
        System.out.println("\n=== Example 2: Traditional For Loop ===");
        // Traditional for loop with index
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        
        System.out.println("\n=== Example 3: Nested Loops ===");
        // Nested loops - each name with numbers 0-3
        for (String name : names) {
            System.out.println("Processing: " + name);
            for (int i = 0; i < 4; i++) {
                System.out.println("  " + name + i);
            }
            System.out.println(); // Empty line for readability
        }
        
        System.out.println("=== Example 4: Optimized Version ===");
        // More efficient approach using StringBuilder for string concatenation
        StringBuilder output = new StringBuilder();
        for (String name : names) {
            for (int i = 0; i < 4; i++) {
                output.append(name).append(i).append(" ");
            }
            System.out.println(output.toString().trim());
            output.setLength(0); // Clear for next iteration
        }
    }
}