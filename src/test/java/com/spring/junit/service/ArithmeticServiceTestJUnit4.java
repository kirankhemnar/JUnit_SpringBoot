/*
package com.unit.service;

import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

*/
/**
 * JUnit 4 Test case class
 *//*

public class ArithmeticServiceTestJUnit4 {

    static int count=0;

    @Autowired
    ArithmeticService arithmeticService;

    @BeforeClass // this method executes before test case
    public static void init(){
        System.out.println("Before all test cases");
        System.out.println("Test case started: "+new Date());
    }
    @Before /// this will execute before each test case method executes
    public void beforeEachTestCase(){
        count=0;
        System.out.println("It will execute before each test case");
    }

    @Test // this test method sumAnyNumbers
    public void additionTest(){
        for (int i=0; i<20; i++ ){
            count+=i;
        }
        System.out.println("This is addition test method and count is:: "+ count);
        int actualResult=ArithmeticService.addition(5, 7);

        int expected=12;

        Assert.assertEquals(expected, actualResult);
    }

    @Test // this test method sumAnyNumbers
    public void sumAnyNumberTest(){
        for (int i=0; i<20; i++ ){
            count+=i;
        }
        System.out.println("This is sumAnyNumber test method and count is:: "+ count);
        int actualResult=ArithmeticService.sumAnyNumbers(1,3,5,6);

        int expectedNumber=15;

        Assert.assertEquals(expectedNumber, actualResult);
    }

    @Test(timeout = 3000) // this test method sumAnyNumbers// in this timeout added 3 seconds, This test case should execute within 3 seconds else It will failed
    public void productTest() throws InterruptedException {
        Thread.sleep(4000);// added for hold for 4 seconds so that this test will fail
        int actualResult=ArithmeticService.product(6,3);

        int expectedNumber=18;

        Assert.assertEquals(expectedNumber, actualResult);
    }




    @AfterClass // this method execute after test case
    public static void cleanUP(){
        System.out.println("End Test Case: "+new Date());
    }
}
*/
