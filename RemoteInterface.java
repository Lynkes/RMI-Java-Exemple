import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    int increment(int number) throws RemoteException;
    int decrement(int number) throws RemoteException;
    int countCharacters(String text) throws RemoteException;
    float addFloats(float num1, float num2) throws RemoteException;
}
