package academy.devdojo;

public class Aula06SwitchCase {
    public static void main(String[] args) {

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;
            default:
                System.out.println("Não deu nada certo.");
        }

        char sex = 'H';

        switch (sex) {
            case 'H':
                System.out.println("Bem-vindo Homem.");
                break;
            case 'F':
                System.out.println("Bem vinda mulher");
        }
    }
}
