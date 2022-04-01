package com.epam.patterns.creational.singlton;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicSingleton {
    private static AtomicSingleton instance;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    private AtomicSingleton() {
    }

    public static AtomicSingleton getInstance() {
        while (instance == null) {
            if (isInitialized.compareAndSet(false, true)) {
                instance = new AtomicSingleton();
            }
        }
        return instance;
    }
}
