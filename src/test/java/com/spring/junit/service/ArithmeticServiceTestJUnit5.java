package com.spring.junit.service;

import org.junit.jupiter.api.*;

/**
 * JUnit 5 Test case
 */
public class ArithmeticServiceTestJUnit5 {


    @BeforeAll  // this method will execute before all test case method
    public static void init(){
        System.out.println("This will execute before all test case");
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("This will execute before each test case");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("This will execute after all test case");
    }
    @AfterEach
    public void afterEachTest(){
        System.out.println("This will execute after each test case");
    }


    @Test
    @DisplayName("This is custom name Addition Test")
    public void additionTest() {
        int actualResult = ArithmeticService.addition(5, 7);
        int expectedResult = 12;

        Assertions.assertEquals(expectedResult, actualResult, "Test case failed");
        System.out.println("inside addition test case");
    }

    @Test
    @Disabled
    public void sumAnyNumberTest(){
        int actualResult=ArithmeticService.sumAnyNumbers(2,5,12,3);
        int expectedResult=22;

        Assertions.assertEquals(expectedResult, actualResult, "sum any number test case failed");
        System.out.println("inside sum any number test case");
    }

}
