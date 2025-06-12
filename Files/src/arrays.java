package Files.src;

import java.util.Arrays; // In order to this library appears, we must type "Arrays" after the array line, and then remove it.

public class arrays {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4}; // We can replace 'new int [5]' by {0, 1, 2, 3, 4},
        numbers[1] = 1;
        numbers[2] = 20;
        numbers[4] = 80;
        numbers[7]= 10; // This returns an error: exception in thread "main" java.lang. Index 7 out of bounds for length 5 (Out of range).
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}