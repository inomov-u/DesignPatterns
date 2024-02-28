package exercise; 


public class LoggerDemo {

    public static void main(String[] args) {
        // TODO: Implement Singleton and Factory Method patterns
        
        FileLogger fileLogger = FileLogger.getFileLogger("log.txt");
        fileLogger.log("This is a test log message", LogLevel.HIGH);
        
        FileLogger fileLogger2 = FileLogger.getFileLogger("log222.txt"); //i added second to check if the same object is returned , since we dont create another txt file named log222.txt it means we are using one filelogger that we created earlier.
        fileLogger2.log("This is a test log message 222", LogLevel.HIGH); //also this output goes to the same filelogger this proves we have only one filelogger.

        //FACTORY METHOD
        LoggerFactory loggerFactory = null;
        
        //business logic chooses which factory to create, you can comment out one of them
        //if (some condition)
        loggerFactory = new DataLoggerFactory();
        //else if
        loggerFactory = new RandomLoggerFactory(); //depending on some condition we might choose random which will generate random logger object
        //else
        loggerFactory = new FileLoggerFactory();
      
        BaseLogger baseLogger = loggerFactory.createLogger();

        //Check the type of created object
        if(baseLogger instanceof FileLogger) System.out.println("true");
        else{ System.out.println("false");}

        baseLogger.log("This is a test log message 333", LogLevel.HIGH);



    }
}
