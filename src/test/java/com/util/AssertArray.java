package com.util;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertArray {
    public static void assertArray(int[] arr1,int[] arr2)
    {
        assertTrue(Arrays.equals(arr1,arr2));
    }

    public static void assertArrays(int[][] arr1,int[][] arr2)
    {
        assertEquals(arr1.length,arr2.length);
        assertEquals(arr1[0].length,arr2[0].length);
        for(int i=0;i<arr1.length;i++)
        {
            assertArray(arr1[i],arr2[i]);
        }
    }
}
