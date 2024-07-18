package com.unit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AssertionExample {


    @Test
    public void assertMethod(){
        System.out.println("This is assertion method");

       /* int expected[]={1,2,3,4,5};
        int[] actual={1,2,3,4,5};

        Assertions.assertArrayEquals(expected, actual);*/

       /* String expected=new String("Kiran");
        String actual=new String("Kiran");
        Assertions.assertSame(expected, actual);// assertSame method  will failed test case because this method check both object are same or not, here we used new created that creates new object
        */

        /*ArithmeticService service=null;
        Assertions.assertNull(service);*/

        /*ArithmeticService service=new ArithmeticService();
        Assertions.assertNotNull(service);*/

        /*List<Integer> expected= Arrays.asList(1,2,3,4,5);
        List<Integer> actual= Arrays.asList(1,2,3,4,5);
        Assertions.assertIterableEquals(expected, actual);*/

        /*Assertions.assertThrows(RuntimeException.class, ()->{
        throw new RuntimeException("Not Exists");
        });
*/
    }
}
