
package com.holamundocourse.classes;

import java.util.Scanner;

public class while_function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.println("Type a command: ");
            input = scanner.next().toLowerCase();
            System.out.println("You typed: " + input);
        }
        System.out.println("You typed exit");
        scanner.close();
    }
}