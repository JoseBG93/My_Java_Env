import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /**
         * Create a calculator that
         * takes two number and then print
         * the result of the sum, subtraction,
         */
    
        Scanner scanner = new Scanner(System.in);
        
        // Read the first number
        System.out.println("Enter the first number: ");
        byte firstNumber = scanner.nextByte();

        // Read the second number
        System.out.println("Enter the second number: ");
        byte secondNumber = scanner.nextByte();

        // Perform calculations
        byte sum = (byte)(firstNumber + secondNumber);
        System.out.println("The sum is: " + sum);
        System.out.println("The result of the subtraction is: " + (firstNumber - secondNumber));
        System.out.println("The result of the multiplication is: " + (firstNumber * secondNumber));
        System.out.println("The result of the division is: " + (firstNumber / secondNumber));
        
        scanner.close();
    }
}