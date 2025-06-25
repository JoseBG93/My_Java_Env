package com.holamundocourse.classes;

import java.util.Scanner;

public class break_and_continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Type a command: ");
            input = scanner.next().toLowerCase();

            if (input.equals("exit")) {
                break; // This will break the loop and exit the program
            }
            if (input.equals("continue")) {
                continue; // This will skip the rest of the code and go back to the beginning of the loop
            }
            System.out.println("This line is printed when the user does not type exit or continue");
            break; // This will break the loop and exit the program
        }
        System.out.println("You typed exit");
        scanner.close();
    }
}