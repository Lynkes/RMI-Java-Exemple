import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            ICalculadora calculadora = new Calculadora();

            // Iniciar o registro RMI na porta 1099
            LocateRegistry.createRegistry(1099);

            // Registrar o objeto remoto no registro RMI
            Naming.rebind("Calculadora", calculadora);

            System.out.println("Servidor RMI da Calculadora está pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
