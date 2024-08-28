import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @BeforeEach
    public void retornoAntes() {
        System.out.println("testando...");
    }

    @Test
    public void soma() {
        double resultado = calculadora.soma(4, 2);
        Assertions.assertEquals(6, resultado, 0);
    }

    @Test
    public void subtracao() {
        double resultado = calculadora.subtracao(4, 2);
        Assertions.assertEquals(2, resultado, 0);
    }

    @Test
    public void divisao() {
        double resultado = calculadora.divisao(4, 2);
        Assertions.assertEquals(2, resultado, 0);
    }

    @Test
    public void multiplicacao() {
        double resultado = calculadora.multiplicacao(4, 2);
        Assertions.assertEquals(8, resultado, 0);
    }

    @AfterEach
    public void confirmacao() {
        System.out.println("teste deu certo!");
    }
}
