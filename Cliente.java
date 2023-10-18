import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            ICalculadora calculadora = (ICalculadora) Naming.lookup("rmi://localhost/Calculadora");

            double a = 10.0;
            double b = 5.0;

            double resultadoSoma = calculadora.somar(a, b);
            double resultadoSubtracao = calculadora.subtrair(a, b);
            double resultadoMultiplicacao = calculadora.multiplicar(a, b);
            double resultadoDivisao = calculadora.dividir(a, b);
            double resultadoPotencia = calculadora.potencia(a, 2.0);
            double resultadoRaizQuadrada = calculadora.raizQuadrada(a);

            System.out.println("Soma: " + resultadoSoma);
            System.out.println("Subtração: " + resultadoSubtracao);
            System.out.println("Multiplicação: " + resultadoMultiplicacao);
            System.out.println("Divisão: " + resultadoDivisao);
            System.out.println("Potência: " + resultadoPotencia);
            System.out.println("Raiz Quadrada: " + resultadoRaizQuadrada);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
