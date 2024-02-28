package exercise;

public class DataLoggerFactory extends LoggerFactory
{
    public BaseLogger createLogger()
    {
        //some logic

        return new DataLogger();
    }
}