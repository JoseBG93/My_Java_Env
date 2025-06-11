// PRIMITIVE DATA TYPES
// --> Integers: byte, short, int, long.
// --> Decimals: float, double.
// --> Boolean: true, false.
// --> char (any single letter).

package Files.src;

public class Main {
    public static void main(String[] args) {
        double age = 18.5f; // When there's a decimal number, we must use double or float, and type "f" after the value.
        int hugeNumber = 1000;
        System.out.println(age);
        boolean isActive = false;
        char course = 'A'; // We must use a single comma (' '), not double (" ").
        System.out.println(isActive);
        System.out.println(course);
    }
}
