import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest2 {

    @ParameterizedTest
    @ValueSource (strings = {"madam","racecar","a man a plan a canal panama","radar","hello","arara"})
    public void testIsPalindrome(String candidate){
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome(candidate));
    }
}
