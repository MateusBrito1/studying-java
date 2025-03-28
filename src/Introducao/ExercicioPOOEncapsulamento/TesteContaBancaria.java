package Introducao.ExercicioPOOEncapsulamento;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria();
        //Settando, estou definindo o numero e o titular etc... (Set = definindo)
        contaBancaria1.setNumero("36547895499");

        contaBancaria1.setTitular("José");
        //Setando o saldo
        //contaBancaria1.setSaldo(100);

        //Depositando o saldo, ficará 100 reais.
        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);

        //Aqui eu estou dando get no número (get = pegando)
        System.out.println(" Olá, " + contaBancaria1.getTitular());
        System.out.println(" O número da conta é : " + contaBancaria1.getNumero());
    }
}
