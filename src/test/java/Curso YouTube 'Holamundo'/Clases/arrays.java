// Simple Java program demonstrating array operations
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Creating and initializing an array
        int[] numbers = {0, 1, 2, 3, 4};
        
        // Modifying array elements
        numbers[1] = 1;
        numbers[2] = 20;
        numbers[4] = 80;
        
        // Printing array contents
        System.out.println("Array contents: " + Arrays.toString(numbers));
        System.out.println("Array length: " + numbers.length);
        
        // Sorting array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
} 