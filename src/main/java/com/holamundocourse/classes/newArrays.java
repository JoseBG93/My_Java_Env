package com.holamundocourse.classes;
// Advanced array operations in Java
import java.util.Arrays;

public class newArrays {
    public static void main(String[] args) {
        // Creating arrays of different types
        int[] numbers = {5, 2, 8, 1, 9};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // Array operations
        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Original names: " + Arrays.toString(names));
        
        // Sorting arrays
        Arrays.sort(numbers);
        Arrays.sort(names);
        
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted names: " + Arrays.toString(names));
        
        // Finding array length
        System.out.println("Numbers array length: " + numbers.length);
        System.out.println("Names array length: " + names.length);
    }
} 
