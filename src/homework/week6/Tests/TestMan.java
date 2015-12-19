package homework.week6.Tests;

import homework.week6.Commands.Man;
import homework.week6.Commands.Pwd;
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
public class TestMan {
    private Man command;

    @Before
    public void setUp() throws Exception {
        command = new Man();
    }

    @Test
    public void testHelp(){
        assertEquals("Show manual for specific command", command.help());
    }

    @Test
    public void testManPwd() throws Exception {
        Pwd pwd = new Pwd();
        String expected = pwd.man();
        List<String> str = new ArrayList<>();
        str.add("pwd");
        command.setArguments(str);
        assertEquals(expected, command.execute());
    }

    @Test
    public void testManExistCommand() throws Exception {
        List<String> str = new ArrayList<>();
        str.add("noteexistcommand");
        command.setArguments(str);
        assertEquals(command.NO_MAN_PAGE_TXT, command.execute());
    }

    @Test
    public void testManDefault() throws Exception {
        assertEquals(command.WHAT_MAN_YOU_WONT, command.execute());
    }

    @Test
    public void testCreateByFactory() throws Exception {
        assertTrue(SimpleCommandFactory.createCommand("man") instanceof Man);
    }
}
