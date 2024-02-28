package exercise;

public class DataLogger extends BaseLogger {
    @Override
    public void log(String message, LogLevel level) {
        if (!shouldLog(level)) {
            return;
        }

        validateMessage(message);

        System.out.println("Logging to database: " + message);
    }
}


