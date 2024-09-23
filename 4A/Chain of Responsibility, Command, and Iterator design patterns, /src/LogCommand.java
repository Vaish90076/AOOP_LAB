public class LogCommand implements Command {
    private String message;
    private LogLevel level;
    private LogHandler handler;

    public LogCommand(String message, LogLevel level, LogHandler handler) {
        this.message = message;
        this.level = level;
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.handleRequest(level, message);
    }
}