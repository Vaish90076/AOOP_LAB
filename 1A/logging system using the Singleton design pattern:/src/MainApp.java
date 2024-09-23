public class MainApp {
    public static void main(String[] args) {
        // Getting the single instance of Logger
        Logger logger = Logger.getInstance();

        // Logging some messages
        logger.log("Application started.");
        logger.log("Performing some operations...");
        logger.log("Application finished.");

        // Verifying that only one instance of Logger is used
        Logger anotherLoggerInstance = Logger.getInstance();
        anotherLoggerInstance.log("This is from the same Logger instance.");
        
        // Output will show that the same instance is being used
    }
}
