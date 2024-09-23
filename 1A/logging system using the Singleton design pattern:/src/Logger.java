// Logger.java - The Singleton Logger Class
public class Logger {

    // Private static variable to hold the single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        // You can also initialize any resources like log file here
        System.out.println("Logger initialized.");
    }

    // Public static method to get the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            // Lazy initialization - instance is created when it's needed
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages, can be extended to log to file, console, etc.
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

