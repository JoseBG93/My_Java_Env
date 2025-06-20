package com.holamundocourse.classes;

// Importing the Point class from java.awt package to demonstrate reference data types
// awt.* stands for Abstract Window Toolkit, which is Java's original platform-independent windowing, graphics, and user-interface widget toolkit
import java.awt.*;

public class reference_data_type {
    public static void main(String[] args) {
        // Create a new Point object with coordinates (1,2)
        // point1 is a reference variable that points to this object in memory
        Point point1 = new Point(1, 2);
        
        // Create another reference variable point2 that points to the same object as point1
        // This means both point1 and point2 reference the same Point object in memory
        Point point2 = point1;
        
        // When we modify point2.x, we're actually modifying the object that both point1 and point2 reference
        // This is why point1 will also show the updated x value of 10
        point2.x = 10;

        System.out.println(point1);

        String string1 = new String("Hi world");
        String string2 = string1;
        String string3 = string1.toUpperCase();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }
} 