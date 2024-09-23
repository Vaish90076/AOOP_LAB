// Client.java
public class Client {
    public static void main(String[] args) {
        // Step 1: Set up the chain of responsibility
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        
        // Chain the handlers
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        
        // Step 2: Create a Logger to manage commands
        Logger logger = new Logger();
        
        // Step 3: Add commands to the logger
        logger.addCommand(new LogCommand("This is an info message.", LogLevel.INFO, infoHandler));
        logger.addCommand(new LogCommand("This is a debug message.", LogLevel.DEBUG, infoHandler));
        logger.addCommand(new LogCommand("This is an error message.", LogLevel.ERROR, infoHandler));
        logger.addCommand(new LogCommand("Another info log.", LogLevel.INFO, infoHandler));
        
        // Step 4: Process all log commands
        logger.processLogs();
    }
}
