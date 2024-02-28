package exercise;
import java.util.Random;

public class RandomLoggerFactory extends LoggerFactory{

    
    public BaseLogger createLogger()
    {
        //some logic
    
        Random random = new Random();

        // Generate a random boolean value
        if(random.nextBoolean())
        {
            return new DataLogger();
        } else {
            return FileLogger.getFileLogger("log.txt");
        }
        
    }
    
}
