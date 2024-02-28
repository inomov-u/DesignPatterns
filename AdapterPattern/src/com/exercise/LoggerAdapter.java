package com.exercise;

public class LoggerAdapter implements ModernLogger {
    private LegacyLogger legacyLogger;

    public LoggerAdapter(LegacyLogger legacyLogger)
    {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void debug(String message) {
        legacyLogger.logMessage("Debug: " + message);
    }

    @Override
    public void error(String message) {
        legacyLogger.logMessage("Error: " + message);
    }
    
}
