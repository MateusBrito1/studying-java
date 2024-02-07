package study;

import java.util.HashSet;
import java.util.Set;

public class Aula22HashSet {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.add("Mateus");
        nomes.add("Sofia");
        nomes.add("Luan");

        nomes.remove("Luan");
        for (String nome : nomes) {
            System.out.println("o NOME É: " + nome);
        }

        System.out.println(nomes.contains("Luan"));
    }
}
