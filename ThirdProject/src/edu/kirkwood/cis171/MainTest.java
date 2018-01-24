package edu.kirkwood.cis171;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void findMin() {
        int[] numbers = {1,2,3,4};
        assertEquals(1, Main.findMin(numbers));
    }
}