import java.rmi.Naming;

public class RemoteClient {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObject = (RemoteInterface) Naming.lookup("rmi://localhost/RemoteObject");

            int number = 10;
            int incremented = remoteObject.increment(number);
            int decremented = remoteObject.decrement(number);

            System.out.println("Número original: " + number);
            System.out.println("Número incrementado: " + incremented);
            System.out.println("Número decrementado: " + decremented);

            String text = "Hello, World!";
            int charCount = remoteObject.countCharacters(text);
            System.out.println("Número de caracteres na string: " + charCount);

            float num1 = 3.5f;
            float num2 = 2.0f;
            float sum = remoteObject.addFloats(num1, num2);
            System.out.println("Soma de " + num1 + " e " + num2 + " é: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
