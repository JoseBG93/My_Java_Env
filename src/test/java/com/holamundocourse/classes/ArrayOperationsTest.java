package com.holamundocourse.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {
    
    @Test
    void testArrayLength() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertEquals(5, numbers.length, "Array should have length 5");
    }
    
    @Test
    void testArraySorting() {
        int[] numbers = {4, 2, 1, 5, 3};
        java.util.Arrays.sort(numbers);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, numbers, "Array should be sorted");
    }
} 