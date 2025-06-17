// PRIMITIVE DATA TYPES
// --> Integers: byte, short, int, long.
// --> Decimals: float, double.
// --> Boolean: true, false.
// --> char (any single letter).

public class primitive_Data_Types {
    public static void main(String[] args) {
        double age = 18.5f; // When there's a decimal number, we must use double or float, and type "f" after the value.
        int hugeNumber = 1000;
        System.out.println(age);
        boolean isActive = false;
        char course = 'A'; // We must use a single commas (' '), not doubles (" ").
        System.out.println(isActive);
        // Typing "sout" allows to call 'System.out.println' function directly. It's a snippet (shortcut).
        System.out.println(course);
        System.out.println(hugeNumber);
    }
}
