package POOConta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        //Também posso setar que o saldo possa começar com 0 reais.
        this.saldo = saldo;
    }

    void depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " Saldo atual :" + saldo);
        } else {
            System.out.println(" O valor do depósito é inválido");
        }
    }

    void sacar (double valor) {
        if (valor < 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + saldo + " Efetuado com sucesso.");
        }
    }
}
