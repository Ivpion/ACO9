package homework.week6.Commands;

import homework.week6.ICommand;

import java.io.File;
import java.util.List;

/**
 * Created by ivan on 16.12.15.
 */
public class Pwd implements ICommand {

    @Override
    public String help() {
        return "Print working directory";
    }

    @Override
    public String man() {
        return "pwd - this command shows current directory";
    }

    @Override
    public String execute(List<Character> options) {
        return new File(".").getAbsolutePath();
    }
}
