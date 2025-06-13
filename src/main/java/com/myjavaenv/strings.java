package com.myjavaenv;

// String is the most important reference data type. By using it, we can create text within our apps.

public class strings {
    public static void main(String[] args) {
        String text = new String("Hi, World!");
        System.out.println(text);
// Besides what we see before, we can type the following code:
// [...] String text = "Hi, World";
// In this case, we remove 'new String' and the brackets ().
// This way is called "literal strings"

        // Remember: first, you specify the data type (in this case, 'int'); then, the name of the variable.
        // As you can see, after '=' there's the class variable name ('text') and a method called '.length()', which is the large of the string "Hi, world!".
        int large = text.length();
        System.out.println(large);

        String newText = text.replace("Hi", "Bye"); // Replace "Hi" by "Bye".
        // The content inside the brackets is called 'argument'. So, text.replace has two arguments: "Hi" and "Bye".
        // Also, strings are changeless; therefore, we cannot modify its content applying a method.
        System.out.println(newText);

        System.out.println(text.endsWith("rld!")); // Check the ending of a variable text.
        System.out.println(text.startsWith("Hi")); // Check the beginning of a variable text.
        System.out.println(text.contains("Wo")); // Check if a variable text contains any character.
        System.out.println(text.indexOf("Wor")); // Check the index of a character (the position within a string).

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String wrong = "  happy     birthday    ";
        System.out.println(wrong.trim()); // This method erases the spaces from the beginning and the end of the text.
        System.out.println(wrong);
    }
}