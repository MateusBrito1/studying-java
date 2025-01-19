package ProgramacaoEstruturada;

import java.util.Scanner;

public class Aula26Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada você quer ver?");

        int tab = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tab + " * " + i + " = " + (tab * i));
        }


    }
}

