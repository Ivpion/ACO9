package homework.week6;

/**
 * Created by ivan on 17.12.15.
 */
public class CommandNotFoundException extends Exception {
    public CommandNotFoundException(){
        super("Command not found");
    }
}
