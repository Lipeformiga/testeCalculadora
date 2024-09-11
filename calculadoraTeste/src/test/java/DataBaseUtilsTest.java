import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataBaseUtilsTest {

    DataBaseUtils database;

    @BeforeEach
    public void setUp() {
        database = new DataBaseUtils();
    }

    @AfterEach
    public void tearDown() {
        database.disconnect();
    }

    @Test
    public void testConnect() {
        database.connect();
        assertTrue(database.isConnected());
    }

    @Test
    public void testDisconnect() {
        database.connect();
        database.disconnect();
        assertFalse(database.isConnected());
    }
}