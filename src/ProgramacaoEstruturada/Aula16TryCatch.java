package ProgramacaoEstruturada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula16TryCatch {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Qual seu nome? ");
            String name = scan.next();

            System.out.println("Qual sua idade? ");
            Double altura = scan.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Desculpe, a idade tem que ser um número ");
        }
    }
}
