package com.exercise;

public class ConcreteModernLogger implements ModernLogger {
    @Override
    public void debug(String message) {
        System.out.println("Debug: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Error: " + message);
    }
}
