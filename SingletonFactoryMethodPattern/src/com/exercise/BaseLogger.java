package exercise;

//abstract class. we can use abstract class or interface, I go with abstract class
public abstract class BaseLogger {
    private LogLevel logLevelThreshold = LogLevel.HIGH;

    protected void validateMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Log message cannot be null or empty");
        }
    }

    protected boolean shouldLog(LogLevel level) {
        return level.getLevel() >= logLevelThreshold.getLevel();
    }

    public abstract void log(String message, LogLevel level);

    
}
