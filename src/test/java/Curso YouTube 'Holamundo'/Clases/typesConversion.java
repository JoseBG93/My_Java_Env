public class typesConversion {
    public static void main(String[] args) {
        // Declaring variables of different types
        int number1 = 100;
        double number2 = 50.5;
        
        // Adding the numbers - byte is automatically converted to int
        // Java automatically performs implicit type conversion (widening) here:
        // 1. number2 (byte) is automatically converted to int
        // 2. Then the addition is performed between two int values
        // 3. The result is stored in the int variable 'result'
        int result = number1 + (int)number2;
        
        System.out.println("First number (int): " + number1);
        System.out.println("Second number (byte): " + number2);
        System.out.println("Result of addition: " + result);
        
        // Demonstrating explicit type conversion
        double convertedResult = (int)result; // By using brackets, we can force the conversion to byte
        System.out.println("Result converted to int: " + convertedResult);
        
        String j = "10";
        int k = 5;
        double l = Double.parseDouble(j) + k; // This is a type conversion from String to double
        System.out.println("Result of addition: " + l);

        String m = "10";
        long n = 50000000;
        double o = Long.parseLong(m) + n; // This is a type conversion from String to long
        System.out.println("Result of addition: " + o);

        // Showing binary representation to explain the overflow
        System.out.println("\nBinary representation:");
        System.out.println("Original result in binary: " + Integer.toBinaryString(result));
        System.out.println("Converted result in binary: " + Integer.toBinaryString((int)convertedResult));
        System.out.println("\nThis happens because a byte can only store values from -128 to 127.");
        System.out.println("When we try to store 150 in a byte, it overflows and wraps around to -106.");
    }
}
// Data types ordered from smallest to largest:
// 1. byte (8 bits): -128 to 127
// 2. short (16 bits): -32,768 to 32,767
// 3. int (32 bits): -2^31 to 2^31-1
// 4. long (64 bits): -2^63 to 2^63-1
// 5. float (32 bits): ~±3.4E38
// 6. double (64 bits): ~±1.8E308

