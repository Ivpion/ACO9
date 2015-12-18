package homework.week6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 16.12.15.
 */
public class CommandLineController {
    private File currentDir = new File(".");
    private String userName = System.getProperty("user.name");
    private SimpleCommandFactory factory = new SimpleCommandFactory();


    public List<String> findOptions(String[] strgs) {
        List<String> listOptions = new ArrayList<>();
        for (int i = 1; i < strgs.length; i++) {
            if (strgs[i].startsWith("-")) {
                String[] args = strgs[i].substring(1).split("");
                for (int j = 0; j < args.length; j++) {
                    listOptions.add(args[j]);
                }
            }
        }
        return listOptions;
    }

    public List<String> findArgs(String[] args) {
        List<String> listArgs = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            if (!args[i].startsWith("-")) {
                listArgs.add(args[i]);
            }
        }
        return listArgs;
    }

    public String getStartLine() {
        return String.format("[%s - %s]$", userName, currentDir.getAbsolutePath());
    }

    public String executeCommand(String command) {
        String[] parts = command.split(" ");
        String cmdName = parts[0];
        cmdName.toCharArray();
        try {
            ICommand commandObject = factory.createCommand(cmdName);

            commandObject.setArguments(findArgs(parts));
            commandObject.setOptions(findOptions(parts));
            return commandObject.execute();

        } catch (CommandNotFoundException exception) {
            return "command was not recognized";
        }



        /*if (command.startsWith("pwd")) {
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
        }*/


    }


}
