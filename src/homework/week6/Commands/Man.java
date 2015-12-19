package homework.week6.Commands;

import homework.week6.ACommand;
import homework.week6.CommandNotFoundException;
import homework.week6.SimpleCommandFactory;

/**
 * Created by ivan on 19.12.15.
 */
public class Man extends ACommand {
    public static final String NO_MAN_PAGE_TXT = "No manual entry for this command";
    public static final String WHAT_MAN_YOU_WONT = "What manual page do you want?" ;

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
        if (commandArgs.size() == 0)
            return WHAT_MAN_YOU_WONT;
       try {
           return SimpleCommandFactory.createCommand(this.commandArgs.get(0)).man();
       } catch (CommandNotFoundException e){
           return NO_MAN_PAGE_TXT;
       }

    }
}
