package homework.week6.Tests;

import homework.week6.CommandNotFoundException;
import homework.week6.Commands.Pwd;
import homework.week6.SimpleCommandFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ivan on 17.12.15.
 */
public class TestFactory {
    private SimpleCommandFactory factory = new SimpleCommandFactory();

    @Test
    public void testCreateCommand() throws Exception{
        assertTrue(factory.createCommand("pwd") instanceof Pwd);
    }

    @Test(expected = CommandNotFoundException.class)
    public void testCreateCommandException() throws Exception {
        factory.createCommand("fklhj");
    }


}
