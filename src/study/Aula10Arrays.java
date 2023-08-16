package academy.devdojo;

public class Aula10Arrays {
    public static int sumOfElementsArrays(int[] ageStudents) {

        int accSum = 0;

        for (int i = 0; i < 5; i++) {
            accSum += ageStudents[i];
        }
        return accSum;
    }

    public static void main(String args[]) {
        int[] ageStudents = new int[5];
        ageStudents[0] = 10;

        ageStudents[1] = 20;
        ageStudents[2] = 30;
        ageStudents[3] = 40;
        ageStudents[4] = 50;

        int sumAge = sumOfElementsArrays(ageStudents);
        System.out.println(sumAge);
    }
}


