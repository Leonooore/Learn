package com.learn.pattern.singleton2;

public class Singleton {
    public String value;
    private static Singleton instance;

    private Singleton(String value) {
        // This code emulates slow initialization
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
