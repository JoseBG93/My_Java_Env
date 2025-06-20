package com.holamundocourse.classes;

public class logical_operators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        
        boolean z = x && y; // (AND) If we have one false, the result is false. If we have two true, the result is true.
        System.out.println(z);

        boolean a = x || y; // (OR) If we have one true, the result is true. If we have two true, the result is true. If we have two false, the result is false.
        System.out.println(a);

        boolean b = !x; // (NOT) If we have one true, the result is false. If we have one false, the result is true.
        System.out.println(b);

        String name = "John";
        boolean checkName = name.equals("John") || name.equals("Jane");
        System.out.println(checkName);

        boolean checkName2 = name.equals("John") && name.equals("Jane");
        System.out.println(checkName2);
    }
}
