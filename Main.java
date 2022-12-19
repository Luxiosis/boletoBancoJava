import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Boleto boleto = new Boleto();
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu número de conta do banco: ");
        boleto.setNumconta(sc.nextInt());

        System.out.println("Digite seu saldo: ");
        boleto.setSaldo(sc.nextDouble());
        System.out.println("Digite seu débito: ");
        boleto.setDebito(sc.nextDouble());
        System.out.println("Digite seu crédito: ");
        boleto.setCredito(sc.nextDouble());
        boleto.calcularSaldo();
    }
}
