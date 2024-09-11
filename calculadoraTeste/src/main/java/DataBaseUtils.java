public class DataBaseUtils {

    private boolean connected = false;

    public void connect(){
        connected = true;
        System.out.println("Conectado ao banco de dados");
    }

    public void disconnect(){
        connected = false;
        System.out.println("Desconectado do banco de dados");
    }

    public boolean isConnected(){
        return connected;
    }
}
