package com.holamundocourse.classes;

public class returningValues {
    public static void main(String[] args) {
        int result = sum(1, 2);
        System.out.println(result);
        
        // Demonstrating method overloading - same method name but different parameters
        // This allows us to call 'sum' with different data types and number of arguments
        double doubleResult = sum(1.5, 2.5);
        System.out.println("Double sum: " + doubleResult);
        
        int tripleResult = sum(1, 2, 3);
        System.out.println("Triple sum: " + tripleResult);
        
        String stringResult = sum("Hello", " World");
        System.out.println("String concatenation: " + stringResult);
    }
    
    // Original method for two integers
    static int sum(int a, int b) {
        return a + b;
    }
    
    // Overloaded method for two doubles
    static double sum(double a, double b) {
        return a + b;
    }
    
    // Overloaded method for three integers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method for two strings (concatenation)
    static String sum(String a, String b) {
        return a + b;
    }
}
    
