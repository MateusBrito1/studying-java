package study;


import java.util.ArrayList;

public class Aula19Listas {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);

        int firstNumber = numeros.get(1);
        System.out.println("O primeiro número é :" + firstNumber);

        numeros.forEach( numero -> {
            System.out.println("numero " + numero);
        });

        boolean isTrue = numeros.contains(10);
        System.out.println("Sim, contém " + isTrue);

    }
}


