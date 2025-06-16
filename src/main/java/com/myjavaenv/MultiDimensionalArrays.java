package com.myjavaenv;

import java.util.Arrays;

/**
 * Demonstrates various examples of multidimensional arrays in Java
 */
public class MultiDimensionalArrays {
    public static void main(String[] args) { // This is the main method, it is the entry point of the program. It must be public and static, so JVM can call it.
        // main method needs "(String[] args)" as a parameter, because it is the way to pass arguments to the program, even if we don't use them.
        // Example 0: 1D Array
        int[] simpleArray = {1, 2, 3, 4, 5};
        System.out.println("1D Array:");
        System.out.println("Using custom print:");
        printArray(simpleArray);
        System.out.println("Using Arrays.toString():");
        System.out.println(Arrays.toString(simpleArray));
        
        // Example 1: 2D Array (Matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
        System.out.println("\n2D Array (Matrix):");
        System.out.println("Using custom print:");
        printMatrix(matrix);
        System.out.println("Using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(matrix));
        
        // Example 2: 3D Array (Cube)
        int[][][] cube = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
        
        System.out.println("\n3D Array (Cube):");
        System.out.println("Using custom print:");
        printCube(cube);
        System.out.println("Using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(cube));
        
        // Example 3: Jagged Array (Array with different lengths)
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        
        System.out.println("\nJagged Array:");
        System.out.println("Using custom print:");
        printJaggedArray(jaggedArray);
        System.out.println("Using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(jaggedArray));
    }
    
    // Función para imprimir array 1D
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Función para imprimir matriz 2D
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    // Función para imprimir array 3D
    private static void printCube(int[][][] cube) {
        for (int[][] layer : cube) {
            for (int[] row : layer) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();  // Línea extra entre capas
        }
    }
    
    // Función para imprimir array irregular
    private static void printJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
} 

// NOTE: There's another way to print matrices using functions like Arrays.toString() for 1D arrays
// and Arrays.deepToString() for multi-dimensional arrays, which we're already using above.



