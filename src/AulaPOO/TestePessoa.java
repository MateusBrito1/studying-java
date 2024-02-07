package AulaPOO;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cor = "negra";
        pessoa.cpf = "111111";
        pessoa.nome = "Mateus";
        pessoa.idade = 10;

        System.out.println(pessoa.imprimirDadosPessoais());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Mariana";
        pessoa2.idade = 20;
        pessoa2.cpf = "3333333";

        System.out.println(pessoa2.imprimirDadosPessoais());
        System.out.println("oláa");
    }
}
