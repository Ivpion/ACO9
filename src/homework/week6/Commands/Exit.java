package homework.week6.Commands;

import homework.week6.ACommand;

/**
 * Created by ivan on 18.12.15.
 */
public class Exit extends ACommand {


    @Override
    public String help() {
        return "exit";
    }

    @Override
    public String man() {
        return "cloth console";
    }

    @Override
    public String execute() {
        return "exit";
    }
}
