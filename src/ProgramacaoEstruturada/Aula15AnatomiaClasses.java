package ProgramacaoEstruturada;

public class Aula15AnatomiaClasses {
    public static void main(String[] args) {
        String firstName = "Mateus";
        String secondName = "Mariana";

        String fullName = fullName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }
}

