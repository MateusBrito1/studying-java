package ProgramacaoEstruturada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula23TryCatch {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual sua idade?");

            int age = scan.nextInt();
            if (age >= 10) {
                System.out.println("Passou");
            } else {
                System.out.println("Não passou, desculpe");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
