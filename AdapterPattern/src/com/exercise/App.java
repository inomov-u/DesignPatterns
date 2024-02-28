package com.exercise;

public class App {
    public static void main(String[] args) {
        LegacyLogger legacyLogger = new LegacyLogger();
        ModernLogger modernLogger = new LoggerAdapter(legacyLogger);

        // The application can use the modern logging interface
        modernLogger.debug("This is a debug message.");
        modernLogger.error("This is an error message.");
    }
}

