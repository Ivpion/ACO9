package homework.week6;

/**
 * Created by ivan on 16.12.15.
 */
public interface ICommand {
    String help();
    String man();
    String execute();

}
