package homework.week6.Tests;

import homework.week6.Commands.Pwd;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
/**
 * Created by ivan on 16.12.15.
 */
public class TestPwd  {

    private Pwd command;
    char[] a = "".toCharArray();
    @Before
    public void setUp() throws Exception {
        command = new Pwd();
    }

    @Test
    public void testHelp() throws Exception{
        assertEquals("Print working directory", command.help());
    }

    @Test
    public void testMan() throws Exception {
        assertEquals("pwd - this command shows current directory", command.man());
    }

    @Test
    public void testExecute() throws Exception {
        File current = new File(".");
        assertEquals(current.getAbsolutePath(), command.execute(a));

    }


}
