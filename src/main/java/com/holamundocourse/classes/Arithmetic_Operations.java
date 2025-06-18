package com.holamundocourse.classes;

public class Arithmetic_Operations {
    public static void main(String[] args) {
        // Basic arithmetic operations with two variables
        int a = 10;
        int b = 3;
        int sum = a + b; // Addition: 10 + 3 = 13
        int subtraction = a - b; // Subtraction: 10 - 3 = 7
        int multiplication = a * b; // Multiplication: 10 * 3 = 30
        int division = a / b; // Integer division: 10 / 3 = 3 (truncates decimal)
        float floatResult = a / b;   // Integer division then converted to float: 10 / 3 = 3.0
        double doubleResult = a / (double)b;  // Double division: 10 / 3 = 3.333...
        float floatResult2 = (float)a / b;  // Float division: 10 / 3 = 3.333...
        double doubleResult2 = a / (double)b;  // Double division: 10 / 3 = 3.333...
        int g = a % b; // Modulus (remainder): 10 % 3 = 1

        // Demonstrating increment operators
        System.out.println("\nIncrement Operator Examples:");
        
        // Pre-increment (++x): increments first, then uses the value
        int x = 5;
        int y = ++x;  // x is incremented first (5->6), then 6 is assigned to y
        System.out.println("Pre-increment (++x):");
        System.out.println("x = " + x);  // x is 6
        System.out.println("y = " + y);  // y is 6
        
        // Post-increment (x++): uses the value first, then increments
        int m = 5;
        int n = m++;  // m's value (5) is assigned to n first, then m is incremented to 6
        System.out.println("\nPost-increment (x++):");
        System.out.println("m = " + m);  // m is 6
        System.out.println("n = " + n);  // n is 5

        System.out.println("\nOriginal arithmetic operations:");
        System.out.println(sum + " // addition");
        System.out.println(subtraction + " // subtraction");
        System.out.println(multiplication + " // multiplication");
        System.out.println(division + " // integer division");
        System.out.println(floatResult + " // float division");
        System.out.println(doubleResult + " // double division");
        System.out.println(floatResult2 + " // integer division converted to float");
        System.out.println(doubleResult2 + " // integer division converted to double");
        System.out.println(g + " // modulus");

        // Compound assignment operators
        // These operators combine an arithmetic operation with assignment
        int o = 5;
        o += 5;  // Same as: o = o + 5
        System.out.println(o + " // o += 5: adds 5 to o (5 + 5 = 10)");

        int p = 5;
        p -= 5;  // Same as: p = p - 5
        System.out.println(p + " // p -= 5: subtracts 5 from p (5 - 5 = 0)");

        int q = 5;
        q *= 5;  // Same as: q = q * 5
        System.out.println(q + " // q *= 5: multiplies q by 5 (5 * 5 = 25)");

        int r = 5;
        r /= 5;  // Same as: r = r / 5
        System.out.println(r + " // r /= 5: divides r by 5 (5 / 5 = 1)");

        int s = 5;
        s %= 5;  // Same as: s = s % 5
        System.out.println(s + " // s %= 5: remainder of s divided by 5 (5 % 5 = 0)");

        int t = 5;
        t *= 5;  // Same as: t = t * 5
        System.out.println(t + " // t *= 5: multiplies t by 5 (5 * 5 = 25)");
    }
}