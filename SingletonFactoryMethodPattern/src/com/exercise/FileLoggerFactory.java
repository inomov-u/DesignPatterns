package exercise;

public class FileLoggerFactory extends LoggerFactory
{
    public BaseLogger createLogger()
    {
        //some logic, we can decide which object we should create here. It can be DataLogger or it can be FileLogger

        return FileLogger.getFileLogger("log.txt");
    }
}