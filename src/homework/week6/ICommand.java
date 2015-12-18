package homework.week6;

import java.util.List;

/**
 * Created by ivan on 16.12.15.
 */
public interface ICommand {
    String help();
    String man();
    String execute();
    void setOptions(List<String> options);
    void setArguments(List<String> commandArgs);
    boolean hesHelpOption();

}
