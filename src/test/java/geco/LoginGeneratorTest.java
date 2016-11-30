package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MONTASSER on 22/11/2016.
 */
public class LoginGeneratorTest {
    private LoginGenerator aLoginGenerateur;

    @Before
    public void setUp() throws Exception {
        String[] start = new String[]{"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"};
        aLoginGenerateur = new LoginGenerator(new LoginService(start));
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String login = aLoginGenerateur.generateLoginForNomAndPrenom("Durand", "Paul");
        Assert.assertEquals("PDUR", login);
    }

    @Test
    public void generateLoginForJRAL2() throws Exception {
        String login = aLoginGenerateur.generateLoginForNomAndPrenom("Ralling", "John");
        Assert.assertEquals("JRAL2",login);
    }

    @Test
    public void generateLoginForJROL1() throws Exception {
        String login = aLoginGenerateur.generateLoginForNomAndPrenom("Rolling", "Jean");
        Assert.assertEquals("JROL1",login);
    }

    @Test
    public void generateLoginForPDUR() throws Exception {
        String login = aLoginGenerateur.generateLoginForNomAndPrenom("Dùrand", "Paul");
        Assert.assertEquals("PDUR", login);
    }

    @Test
    public void generateLoginForPDU() throws Exception {
        String login = aLoginGenerateur.generateLoginForNomAndPrenom("Du", "Paul");
        Assert.assertEquals("PDU", login);
    }

}