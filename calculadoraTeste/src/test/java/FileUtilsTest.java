import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class FileUtilsTest {

    private static FileUtils fileUtils;

    @BeforeAll
    public static void setUp(){
        fileUtils = new FileUtils();
        fileUtils.openConnection();
    }

    @AfterAll
    public static void tearDown(){
        fileUtils.closeConnection();
    }
    @Test
    public void testCreateFile(){
        assertEquals(fileUtils.createFile("teste"), "teste");
    }
    @Test
    public void testDeleteFile(){
        fileUtils.createFile("teste");
        assertEquals(fileUtils.deleteFile("teste"), true);
    }
}