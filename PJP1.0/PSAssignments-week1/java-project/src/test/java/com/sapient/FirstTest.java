package com.sapient;
import static org.junit.Assert.*;
import org.junit.Test;
 

public class FirstTest {

	CheckEven example = new CheckEven();
 
    @Test
    public void testOdd() {
      assertEquals(false, example.checkEven(3));
    }
    @Test
    public void testEven() {
        assertEquals(true, example.checkEven(2));
    }

    @Test
    public void testOdd1() {
      assertEquals(false, example.checkEven(7));
    }

    @Test
    public void testOdd2() {
      assertEquals(false, example.checkEven(33));
    }
}