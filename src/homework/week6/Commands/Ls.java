package homework.week6.Commands;

import homework.week6.ACommand;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ivan on 17.12.15.
 */
public class Ls extends ACommand{
    private List<File> path = new ArrayList<>();

    @Override
    public String help() {
        return "ls - list directory contents";
    }

    @Override
    public String man() {
        return "List  information  about  the FILEs (the current directory by default).";
    }


    @Override
    public String execute() {
        // todo
        // 1. catch nullPointerExc massage "file not found"
        // 2. do not shows hidden files without "-a" option
        // 3. show list with "-l" option

        String result = "";
        String[] filesList;
        // take current working directory
        if (commandArgs.size()==0){
            filesList = new File(".").list();
            for (int i = 0; i < filesList.length ; i++) {
                result += filesList[i] + " ";
            }
        } else {
            for (String fileName : commandArgs){
                filesList = new File(fileName).list();
                result +="\n" + fileName + ": \n";
                for (int i = 0; i < filesList.length ; i++) {
                    result += filesList[i] + " ";
                }
            }
        }
        return result;
    }
}
//