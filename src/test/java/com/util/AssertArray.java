package com.util;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertArray {
    public static void assertIntArray(int[] arr1, int[] arr2)
    {
        assertTrue(Arrays.equals(arr1,arr2));
    }

    public static void assertIntArrays(int[][] arr1, int[][] arr2)
    {
        assertEquals(arr1.length,arr2.length);
        assertEquals(arr1[0].length,arr2[0].length);
        for(int i=0;i<arr1.length;i++)
        {
            assertIntArray(arr1[i],arr2[i]);
        }
    }
    public static void assertCharArray(char[] arr1, char[] arr2)
    {
        assertTrue(Arrays.equals(arr1,arr2));
    }

    public static void assertCharArrays(char[][] arr1, char[][] arr2)
    {
        assertEquals(arr1.length,arr2.length);
        assertEquals(arr1[0].length,arr2[0].length);
        for(int i=0;i<arr1.length;i++)
        {
            assertCharArray(arr1[i],arr2[i]);
        }
    }
}
