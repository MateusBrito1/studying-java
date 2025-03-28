package Introducao.ProgramacaoEstruturada;

public class Aula11Arrays {
    public static void main(String[] args) {
        // byte, short, int, longe, float e double  = 0
        // char = '\u0000' ' ' (espaço em branco)
        // boolean = false
        // String = null

        String[] nomes = new String[3];

        nomes[0] = "Mateus";
        nomes[1] = "Fernanda";

        for (String nome: nomes) {
            if(nome != null && nome.equals("Mateus")) {
                System.out.println("Encontrado " + nome);
            }
        }

        //System.out.println(nomes[0]);
        //System.out.println(nomes[1]);

    }
}
