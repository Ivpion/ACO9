package homework.week6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 17.12.15.
 */
public abstract class ACommand implements ICommand{
    protected List<String> options = new ArrayList<>();
    protected List<String> commandArgs = new ArrayList<>();


    @Override
    public String help() {
        return null;
    }

    @Override
    public String man() {
        return null;
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public void setArguments(List<String> commandArgs) {
        this.commandArgs = commandArgs;
    }
}
