package homework.week6;

import homework.week6.Commands.*;
/**
 * Created by ivan on 17.12.15.
 */
public class SimpleCommandFactory {


    public static ICommand createCommand(String commandName) throws CommandNotFoundException{
    ICommand command;
        if (commandName.equals("pwd")){
            command = new Pwd();
        }  else if (commandName.equals("ls")){
            command = new Ls();
        } else if (commandName.equals("exit")){
            command = new Exit();
        } else if (commandName.equals("man")){
            command = new Man();
        }
        else {
            throw new CommandNotFoundException();
        }
        return command;
    }

}
