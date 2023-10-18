import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {
    public Calculadora() throws RemoteException {
        super();
    }

    @Override
    public double somar(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    @Override
    public double potencia(double base, double expoente) throws RemoteException {
        return Math.pow(base, expoente);
    }

    @Override
    public double raizQuadrada(double a) throws RemoteException {
        if (a < 0) {
            throw new RemoteException("Raiz quadrada de número negativo não é permitida.");
        }
        return Math.sqrt(a);
    }
}
