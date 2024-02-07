package POOConta;

public class ContaBancaria {

    String numero;
    String titular;
    double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de: " + valor + " Saldo atual R$ " + saldo);
        } else {
            System.out.println("O valor de depósito é inválido.");
        }
    }

    //sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual " + saldo);
        } else {
            System.out.println("Saldo insuficiente para prosseguir com o saque");
        }
    }
}
