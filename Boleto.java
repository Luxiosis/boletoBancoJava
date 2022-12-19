/*
EXERCÍCIO 02: Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após,
calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual
for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */

public class Boleto {
    private int numconta;
    private double saldo;
    private double debito;
    private double credito;
    private double atual;

    public int getNumconta() {
        return numconta;
    }
    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getDebito() {
        return debito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void calcularSaldo(){
        atual = saldo - (debito + credito);
        System.out.println("Seu saldo atual é de: " + atual);
        if (atual >= 0) {
            System.out.println("Saldo positivo.");
        } else {
            System.out.println("Saldo negativo.");
        }
    }
}
