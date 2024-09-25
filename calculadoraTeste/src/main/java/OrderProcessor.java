public class OrderProcessor {

    public double processOrder(double preco, int quantidade){
        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade negativa!");
        }
        if (preco < 0){
            throw new IllegalArgumentException("preco negativo!");
        }
        return quantidade * preco;
    }
}
