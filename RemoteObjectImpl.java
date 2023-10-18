import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObjectImpl extends UnicastRemoteObject implements RemoteInterface {
    public RemoteObjectImpl() throws RemoteException {
        super();
    }

    @Override
    public int increment(int number) throws RemoteException {
        System.out.println("Incrementando " + number);
        return number + 1;
    }

    @Override
    public int decrement(int number) throws RemoteException {
        System.out.println("Decrementando " + number);
        return number - 1;
    }

    @Override
    public int countCharacters(String text) throws RemoteException {
        System.out.println("Contando caracteres da string: " + text);
        return text.length();
    }

    @Override
    public float addFloats(float num1, float num2) throws RemoteException {
        System.out.println("Somando " + num1 + " e " + num2);
        return num1 + num2;
    }
}
