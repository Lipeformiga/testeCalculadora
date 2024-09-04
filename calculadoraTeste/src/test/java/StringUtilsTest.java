import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    private StringUtils utils;

    @Before
    public void setUp(){
        utils = new StringUtils();
    }

    @Test
    public void testIsPalindrome(){
        assertTrue(utils.isPalindrome("Arara"));
        assertTrue(utils.isPalindrome(" "));
        assertFalse(utils.isPalindrome("hello"));
        assertTrue(utils.isPalindrome("subi no onibus"));
    }
    @Test
    public void testReverse(){
        assertEquals("arara",utils.reverse("Arara"));
    }

    @Test
    public void testeToUpperCase(){
        assertEquals("ARARA",utils.toUpperCase("arara"));
    }

}
