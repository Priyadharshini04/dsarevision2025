package com.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class AssertArrayList<T> {

    public void assertArrayList(ArrayList<T> list1, ArrayList<T> list2)
    {
        assertEquals(list1.size(),list2.size());
        assertTrue( list1.containsAll(list2));
        assertTrue( list2.containsAll(list1));
    }
    public void assertArrayLists(ArrayList<ArrayList<T>> list1, ArrayList<ArrayList<T>> list2)
    {
        assertEquals(list1.size(),list2.size());
        for(int i=0;i<list1.size();i++)
        {
            assertArrayList(list1.get(i),list2.get(i));
        }
    }

}
