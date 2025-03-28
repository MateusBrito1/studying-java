package Introducao.ExercicioPOO4Polimorfismo;

import java.util.Scanner;

public class Cachorro implements Animal {

    @Override
    public void som() {
        System.out.println("AUAU");
    }

    @Override
    public void cor() {
        String cor = "marrom";
        System.out.println("O Cachorro tem a cor: " + cor);
    }

    @Override
    public void patas() {
        int patas = 4;
        System.out.println("O cachorro tem " + patas + " patas");
    }

    void humorDoCachorro() {
        Scanner sc = new Scanner(System.in); //Abrindo o scanner, para poder inserir algo no input
        System.out.println(" Cachorro comeu?"); // A pergunta para o scanner
        String humor = sc.nextLine().toLowerCase(); // Uma variável que recebe o que vai ser digitado e logo após
        // (toLowerCase) para a resposta ser certa mesmo se for com começo maiusculo ou minusculo.
        if (humor.equals("sim")) { // Vai pegar se o que foi digitiado no input foi o mesmo que está no 'equals'
            System.out.println("O cachorro está muito feliz");
        } else {
            System.out.println(" O Cachorro está " + humor);
        }
    }
}
