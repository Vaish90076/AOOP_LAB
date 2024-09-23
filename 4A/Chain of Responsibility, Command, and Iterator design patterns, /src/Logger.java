// Logger.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger {
    private List<Command> logCommands;

    public Logger() {
        logCommands = new ArrayList<>();
    }

    // Add a logging command to the list
    public void addCommand(Command command) {
        logCommands.add(command);
    }

    // Process all commands using the iterator
    public void processLogs() {
        Iterator<Command> iterator = logCommands.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.execute();
        }
    }
}
