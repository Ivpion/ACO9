package homework.week6;
import java.io.File;
/**
 * Created by ivan on 16.12.15.
 */
public class CommandLineController {
    private File currentDir = new File(".");
    private String userName = System.getProperty("user.name");

    public String getStartLine() {
        return String.format("[%s - %s]$", userName, currentDir.getAbsolutePath());
    }

    public String executeCommand(String command) {
        if (command.startsWith("pwd")) {
            return currentDir.getAbsolutePath();
        } else if ("exit".equals(command)) {
            return "exit";
        } else if (command.startsWith("cd")) {
            String[] commandArgPair = command.split(" ");
            String newPath = commandArgPair[1];

            if (!newPath.startsWith("/")) {
                // Relative path
                currentDir = new File(currentDir, newPath);
            } else {
                // absolute
                currentDir = new File(newPath);
            }
        }

        return "command was not recognized";

    }

}
