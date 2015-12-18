package homework.week6.Commands;

import homework.week6.ACommand;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ivan on 17.12.15.
 */
public class Ls extends ACommand {
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

        String result = "";
        String[] filesList;
        // take current working directory
        if (commandArgs.size() == 0) {
            filesList = new File(".").list();
            result += getFileListAsString(filesList);
        } else {
            try {
                for (String fileName : commandArgs) {
                    filesList = new File(fileName).list();
                    result += "\n" + fileName + ": \n";
                    result += getFileListAsString(filesList);
                }
                return result;
            } catch (NullPointerException exception) {
                return "Files not found. Perhaps directory does not exist";
            }

        }
        return result;
    }

    private String getFileListAsString(String[] filesList){
        String separator = " ";
        if (this.options.contains("l"))
            separator = "\n";
        String result ="";
        for (int i = 0; i < filesList.length; i++) {
            if (this.options.contains("a")){
                result+= filesList[i] + separator;
            }
            else {if (!filesList[i].startsWith("."))
                result += filesList[i] + separator;
            }
        }
        return result;
    }
}
//