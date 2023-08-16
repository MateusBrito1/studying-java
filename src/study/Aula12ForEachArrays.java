package study;

public class Aula12ForEachArrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Mateus";
        nomes[1] = "Fernanda";

        for (String nome : nomes) {
            if (nome != null && nome.equals("Mateus")) {
                System.out.println("Encontrado " + nome);
            }
        }
    }
}
