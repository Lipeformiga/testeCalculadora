import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ListUtilsTeste {

    private List<String> list;
    private ListUtils listUtils;

    @Before
    public void setUP(){
        list = new ArrayList<>();
        listUtils = new ListUtils();
    }

    @Test
    public void testAddToList(){
        listUtils.addToList(list,"item1");
        assertEquals(1,list.size());
        assertTrue(list.contains("item1"));
        listUtils.addToList(list,"item2");
        assertEquals(2,list.size());
    }

    @Test
    public void testRemoveFromList(){
        listUtils.addToList(list,"item1");
        listUtils.removeFromList(list,"item1");
        assertEquals(0,list.size());
        assertFalse(list.contains("item1"));
        listUtils.removeFromList(list,"item2");
        assertEquals(0,list.size());
    }
    @Test
    public void testfindInList(){
        list.add("item1");
        assertTrue(listUtils.findInList(list,"item1"));
        list.add("item2");
        assertTrue(listUtils.findInList(list,"item2"));
        assertFalse(listUtils.findInList(list,"item3"));
    }

    @Test
    public void removeItemExistente(){
        list.add("item1");
        listUtils.removeFromList(list,"item2");

        assertEquals(1,list.size());
    }
}