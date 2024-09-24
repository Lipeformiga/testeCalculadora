public class CalculadoraComExcecao {

    public int divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Divisor não pode ser zero!");
        }
        return a / b;
    }
}