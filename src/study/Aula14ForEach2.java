package study;

import java.util.Random;

public class Aula14ForEach2 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Random random = new Random();


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        int menorNumero = numeros[0];

        for (int numero : numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("O menor número é " + menorNumero);

    }
}
