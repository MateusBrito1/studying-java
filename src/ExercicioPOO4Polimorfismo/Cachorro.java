package ExercicioPOO4Polimorfismo;

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
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cachorro comeu?");
        String humor = sc.nextLine().toLowerCase();

        if (humor.equals("sim")) {
            System.out.println("O cachorro está muito feliz");
        } else {
            System.out.println(" O Cachorro está " + humor);
        }
    }
}
