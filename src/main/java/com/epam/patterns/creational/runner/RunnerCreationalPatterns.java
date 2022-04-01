package com.epam.patterns.creational.runner;

import com.epam.patterns.creational.singlton.Singleton;

import java.util.logging.Logger;


public class RunnerCreationalPatterns {


    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        boolean result1 = singleton1.equals(singleton2);
        boolean result2 = singleton2.equals(singleton3);
        boolean result3 = singleton3.equals(singleton1);
        boolean result4 = singleton3.equals(singleton4);
        System.out.println("" + result1 + result2 + result3 + result4);

    }
}
