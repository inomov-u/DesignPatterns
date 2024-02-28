package exercise;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends BaseLogger {
    private static FileLogger fileLogger;
    private String logFilePath;

    private FileLogger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public static FileLogger getFileLogger(String logFilePath)
    {
        FileLogger result = fileLogger;
        if(result != null)
        {
            return fileLogger;
        }

        synchronized(FileLogger.class){
            if(fileLogger == null){
                fileLogger = new FileLogger(logFilePath);
            }
            return fileLogger;
        }

    }

    @Override
    public void log(String message, LogLevel level) {
        if (!shouldLog(level)) {
            return;
        }

        validateMessage(message);

        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
