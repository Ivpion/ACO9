package homework.week6;

import homework.week6.Commands.*;
/**
 * Created by ivan on 17.12.15.
 */
public class SimpleCommandFactory {


    public ICommand createCommand(String commandName) throws CommandNotFoundException{
    ICommand command;
        if (commandName.equals("pwd")){
            command = new Pwd();
        }  else if (commandName.equals("ls")){
            command = new Ls();
        }
        else {
            throw new CommandNotFoundException();
        }
        return command;
    }

}
