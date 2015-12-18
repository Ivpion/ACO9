package homework.week6.Commands;

import homework.week6.ACommand;

/**
 * Created by ivan on 19.12.15.
 */
public class Man extends ACommand {
    @Override
    public  String help() {
        return "Show manual for specific command";
    }

    @Override
    public String man() {
        return "Manual for manual";
    }

    @Override
    public String execute() {
        return null;
    }
}
