package ProgramacaoEstruturada;

import java.util.ArrayList;
import java.util.List;

public class Aula18EstruturasDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Mateus");
        nomes.add("Vini");
        nomes.add("Elias");

        //System.out.println(nomes.get(0));

//        for (String nome : nomes) {
//            System.out.println("O nome é: " + nome);
//        }
        nomes.forEach(nome -> System.out.println("O nome é: " + nome));
        System.out.println("Não sei bem o que fazer");
    }
}
