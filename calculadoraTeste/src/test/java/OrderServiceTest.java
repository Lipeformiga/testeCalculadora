import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceTest {

    private OrderService orderService;
    private List<String> orders;

    @BeforeEach
    public void setUp(){
        orderService = new OrderService();
        orders = new ArrayList<>();
    }
    @AfterEach
    public void tearDown(){
        System.out.println("finalizando teste...");
    }

    @Test
    public void addOrderTest(){
        orderService.addOrder("item1");
        orders = orderService.getAllOrders();
        assertEquals(1,orders.size());
        assertTrue(orders.contains("item1"));
    }
    @Test
    public void removeOrderTest(){
        orderService.addOrder("item1");
        orders = orderService.getAllOrders();
        orderService.remover("item1");
        assertEquals(0,orders.size());
        assertFalse(orders.contains("item1"));
    }
    @Test
    public void clearAllOrders(){
        orderService.addOrder("item1");
        orderService.addOrder("item2");
        List<String> orders = orderService.getAllOrders();
        orderService.clearAllOrders();
        assertEquals(0,orders.size());
        assertFalse(orders.contains("item1"));
        assertFalse(orders.contains("item2"));
    }

    @Test
    public void testGetAllOrders() {
        orderService.addOrder("Pedido 1");
        orderService.addOrder("Pedido 2");
        orders = orderService.getAllOrders();
        assertEquals(2, orders.size());
        assertTrue(orders.contains("Pedido 1"));
        assertTrue(orders.contains("Pedido 2"));
    }
}