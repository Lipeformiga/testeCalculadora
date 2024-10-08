import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTestParametros {

    @ParameterizedTest
    @CsvSource({"1,2,3","5,5,10","10,15,25","-1,-1,-2"})
    public void testeAdd(int a, int b, int expected){
        Calculadora calc = new Calculadora();
        assertEquals(expected,calc.soma(a,b));
    }

    @ParameterizedTest
    @CsvSource({"5,2,3","10,5,5","20,10,10","0,-1,1"})
    public void testeSUb(int a, int b, int expected){
        Calculadora calc = new Calculadora();
        assertEquals(expected,calc.subtracao(a,b));
    }
}
