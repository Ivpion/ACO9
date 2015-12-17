package homework.week6.Commands;

import homework.week6.ICommand;
import homework.week6.ICommandWithOptions;

/**
 * Created by ivan on 17.12.15.
 */
public class Ls implements ICommand, ICommandWithOptions{
    @Override
    public String help() {
        return "ls - list directory contents";
    }

    @Override
    public String man() {
        return "List  information  about  the FILEs (the current directory by default).";
    }

    @Override
    public String execute(char[] options) {
        return null;
    }

    @Override
    public String execute() {
        return null;
    }
}
