package com.holamundocourse.classes;

public class method_basics {
    public static void main(String[] args) {
        // Here we are passing "arguments" (actual values) to the methods
        // "John" and 20 are arguments that will be assigned to the parameters
        printHello("John", 20);
        printbye("Ruth", 43);
    }
    
    // In method declaration, "name" and "age" are called "parameters" 
    // Parameters are like variables that receive the values passed as arguments
    static void printHello(String name, int age) {
        System.out.println("Hello " + name + ". You are " + age + " years old.");
    }

    // Parameters vs Arguments:
    // - Parameters: Variables in method declaration (String name, int age)
    // - Arguments: Actual values passed when calling the method ("John", 20)
    static void printbye(String name, int age) {
        System.out.println("Bye" + name + ". You are " + age + " years old.");
    }

}