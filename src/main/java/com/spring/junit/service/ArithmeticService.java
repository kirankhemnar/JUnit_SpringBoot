package com.spring.junit.service;

public class ArithmeticService {

    public static int addition(int a, int b){

        return a+b;
    }

    public static int product(int a, int b){
        return a*b;
    }

    public static int divide(int a, int b){

        return a/b;
    }

    public static int sumAnyNumbers(int ...numbers){
        int s=0;
        for (int i:numbers){
            s+=i;
           // s++;
        }

        return s;
    }
}
