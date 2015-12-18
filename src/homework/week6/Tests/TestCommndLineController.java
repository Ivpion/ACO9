package homework.week6.Tests;

import homework.week6.CommandLineController;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ivan on 17.12.15.
 */
public class TestCommndLineController {
    private CommandLineController controller = new CommandLineController();

    @Test
    public void testParsingCommandLine() throws Exception {
        String commandLineStr = "ls -al some/home";
        String option = "";
        // 1 define command. Expect "ls"
        // 2 list options. Expect List<String> ("a","l")
        // 3 list args. Expect List<String> ("some/dir")
        String[] parts = commandLineStr.split(" ");
        String cmdName = parts[0];
        assertEquals("ls", cmdName);

        List<String> expectedOptions = Arrays.asList(new String[]{"a", "l"});
        List<String> expectedOptions2 = Arrays.asList(new String[]{"l", "a"});


        List<String> resultOptions1 = controller.findOptions(parts);
        List<String> resultOptions2 = controller.findOptions("ls -la test".split(" "));
        List<String> resultOptions3 = controller.findOptions("ls -l -a test".split(" "));
        List<String> resultOptions4 = controller.findOptions("ls -al".split(" "));


        assertEquals(expectedOptions, resultOptions1);
        assertEquals(expectedOptions2, resultOptions2);
        assertEquals(expectedOptions2, resultOptions3);
        assertEquals(expectedOptions, resultOptions4);

        List<String> expectedArgs = Arrays.asList(new String("some/home"));
        List<String> resultArgs = controller.findArgs(parts);

        assertEquals(expectedArgs, resultArgs);


    }

    @Test
    public void testFindArgs() throws Exception {
        String commandLineStr = "ls /src";
        String[] parts = commandLineStr.split(" ");


        List<String> expectedArgs = Arrays.asList(new String("/src"));
        List<String> resultArgs = controller.findArgs(parts);

        assertEquals(expectedArgs, resultArgs);
    }
}



