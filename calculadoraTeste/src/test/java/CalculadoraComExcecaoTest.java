import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraComExcecaoTest {

    @Test
    public void testDivide(){
        CalculadoraComExcecao calc = new CalculadoraComExcecao();
        assertEquals(2, calc.divide(4,2));
    }

    @Test
    public void testDivideByZero(){
        CalculadoraComExcecao calc = new CalculadoraComExcecao();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4,0),
                "Divisor não pode ser zero!");
    }
}