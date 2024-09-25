import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {
    OrderProcessor process = new OrderProcessor();
    @Test
    public void testProcessOrderNegativePrice(){
        assertThrows(IllegalArgumentException.class, () -> process.processOrder(-1.0,2),
                "preco negativo!");
    }
    @Test
    public void testProcessOrderNegativeAmount(){
        assertThrows(IllegalArgumentException.class, () -> process.processOrder(2.0,-1),
                "quantidade negativa!");
    }

    @ParameterizedTest
    @CsvSource({"2,3,6","4,4,16","7,2,14","8,8,64"})
    public void testProcessOrder(int quantidade, double preco, int expected){
        OrderProcessor process = new OrderProcessor();
        double total = process.processOrder(preco, quantidade);
        assertEquals(expected, total);
    }



    static Stream<Arguments> testPreco(){

        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(2,2,4),
                org.junit.jupiter.params.provider.Arguments.of(5,5,25),
                org.junit.jupiter.params.provider.Arguments.of(10,15,150),
                org.junit.jupiter.params.provider.Arguments.of(2,3,6)
        );
    }

    @ParameterizedTest
    @MethodSource("testPreco")
    public void testProcessOrder2(int quantidade, double preco, int expected){
        double total = process.processOrder(preco,quantidade);
        assertEquals(expected, total);
    }
}
