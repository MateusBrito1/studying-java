package ProgramacaoEstruturada;

public class Aula24TypeCasting {
    public static void main(String[] args) {

        int num = 10;
        int doborNum = num * 2;

        System.out.println(doborNum);

        char letra = 'B';

        int letra1 = (int) letra;
        System.out.println(letra1);

        double num1 = 15.75;
        double num2 = 20.40;

        double sum = num1 + num2;

        System.out.println(sum);
    }
}
