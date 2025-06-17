
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("Enter a number between -128 and 127: ");
        Scanner number1 = new Scanner(System.in);
        byte firstNumber = number1.nextByte();
        System.out.println("You entered: " + firstNumber);
        number1.close();
    }
}
