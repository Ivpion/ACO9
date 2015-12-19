package homework.week6.Tests;

import homework.week6.Commands.Ls;
import homework.week6.SimpleCommandFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ivan on 19.12.15.
 */
public class TestLs {
    private Ls command;


    @Before
    public void setUp() throws Exception {
        command = new Ls();
    }

    @Test
    public void testLsDefault() throws Exception{
        assertEquals("src README.md ACO9.iml out ", command.execute());
    }

    @Test
    public void testLsDefaultList() throws Exception {
        List<String> str = new ArrayList<>();
        str.add("l");
        command.setOptions(str);
        assertEquals("src\n" +
                "README.md\n" +
                "ACO9.iml\n" +
                "out\n", command.execute());
    }

    @Test
    public void testLsDefaultHidden() throws Exception {
        List<String> str = new ArrayList<>();
        str.add("a");
        command.setOptions(str);
        assertEquals("src .idea README.md .git ACO9.iml out ", command.execute());
    }

    @Test
    public void testCustomPath() throws Exception {
        List<String> str = new ArrayList<>();
        str.add("src/homework/week6/Tests/Mock");
        command.setArguments(str);
        assertEquals("\n" +
                "src/homework/week6/Tests/Mock: \n" +
                "Mock2 fileB.txt fileA.txt ", command.execute());
    }

    @Test
    public void testCustomPathHidden() throws Exception {
        List<String> opt = new ArrayList<>();
        List<String> arg = new ArrayList<>();
        opt.add("a");
        arg.add("src/homework/week6/Tests/Mock");
        command.setArguments(arg);
        command.setOptions(opt);
        assertEquals("\n" +
                "src/homework/week6/Tests/Mock: \n" +
                ".Hidden.txt Mock2 fileB.txt fileA.txt ", command.execute());
    }
    @Test
    public void testMultipleArgs() throws Exception {
        List<String> opt = new ArrayList<>();
        List<String> arg = new ArrayList<>();
        opt.add("a");
        arg.add("src/homework/week6/Tests/Mock");
        arg.add("src/homework/week6/Tests/Mock/Mock2");
        command.setArguments(arg);
        command.setOptions(opt);
        assertEquals("\n" +
                "src/homework/week6/Tests/Mock: \n" +
                ".Hidden.txt Mock2 fileB.txt fileA.txt \n" +
                "src/homework/week6/Tests/Mock/Mock2: \n" +
                "FileC.txt ", command.execute());
    }

    @Test
    public void testCreateByFactory() throws Exception {
        assertTrue(SimpleCommandFactory.createCommand("ls") instanceof Ls);
    }
}
