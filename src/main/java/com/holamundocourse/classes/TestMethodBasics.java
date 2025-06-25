package com.holamundocourse.classes;

public class TestMethodBasics {
    public static void main(String[] args) {
        // Llamando al método printHello desde otra clase
        method_basics.printHello("María", 25);
        method_basics.printbye("Carlos", 30);
        
        System.out.println("--- Llamadas desde otra clase ---");
        method_basics.printHello("Ana", 22);
    }
} 