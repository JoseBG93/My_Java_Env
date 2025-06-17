import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringValue = scanner.next(); // This method allows to read the next token of the input. For example, if we type "Hello World", it will read "Hello".
        System.out.println(stringValue);

        scanner.nextLine(); // Consume the remaining newline character. It's necessary to avoid problems with the next line.

        String stringValue2 = scanner.nextLine(); // This method allows to read the next line of the input. For example, if we type "Hello World", it will read "Hello World".
        System.out.println(stringValue2);

        byte byteValue = scanner.nextByte(); // Reads a byte value from the input
        System.out.println("You entered your age: " + byteValue);
        scanner.close(); // Close the scanner to prevent resource leaks

        // We can also read other primitive types like int, long, float, double, boolean, char, etc., using the same method.
    }
} 