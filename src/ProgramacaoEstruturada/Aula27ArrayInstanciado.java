package ProgramacaoEstruturada;

// Vai ser um produto, vamos listar quais produtos estão disponiveis e a quantidade.
// Vamos poder adicionar mais de um produto no carrinho e vai somar todos.
// Vamos adicionar no carrinho e também podemos remover

import java.util.ArrayList;

public class Aula27ArrayInstanciado {
    public static void main(String[] args) {

        ArrayList<String> product = new ArrayList<>();

        double placaMae = 790.99;
        double memoriaRam = 599.99;

        product.add("Placa mae");
        product.add("Placa de video");
        product.add("Memoria ram");

        System.out.println(product);


    }

}
