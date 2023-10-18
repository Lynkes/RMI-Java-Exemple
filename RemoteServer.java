import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RemoteServer {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObject = new RemoteObjectImpl();

            // Iniciar o registro RMI na porta 1099
            LocateRegistry.createRegistry(1099);

            // Registrar o objeto remoto no registro RMI
            Naming.rebind("RemoteObject", remoteObject);

            System.out.println("Servidor RMI está pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
