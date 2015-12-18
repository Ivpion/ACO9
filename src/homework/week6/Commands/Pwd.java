package homework.week6.Commands;

import homework.week6.ACommand;

import java.io.File;

/**
 * Created by ivan on 16.12.15.
 */
public class Pwd extends ACommand {

    @Override
    public String help() {
        return "Print working directory";
    }

    @Override
    public String man() {
        return "pwd - this command shows current directory";
    }

    @Override
    public String execute() {
        return new File(".").getAbsolutePath();
    }


}
