package com.holamundocourse.classes;

public class parametersWithArray {

    public static void main(String[] args) {
       int result = sum(new int[] {1, 2, 3, 4, 5});
       System.out.println(result);
    }

    static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
    
}
