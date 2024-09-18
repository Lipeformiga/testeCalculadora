import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class Calculadora2Test {

    @Test
    public void testSoma(){
        // Esperamos que a soma de 2 + 3 seja 5

        Calculadora calc = new Calculadora();
        Assertions.assertEquals(5,calc.soma(2,3));
        Assertions.assertEquals(10,calc.soma(5,5));
        Assertions.assertEquals(0,calc.soma(0,0));
        Assertions.assertEquals(-1,calc.soma(1,-2));
    }
}