package ExercicioPOO4Polimorfismo;

public class Gato implements Animal {
    @Override
    public void som() {
        System.out.println("Miau");
    }

    @Override
    public void cor() {
        String cor = "Preto";
        System.out.println("A cor do gato é: " + cor);
    }

    @Override
    public void patas() {
        int patas = 4;
        System.out.println(" O gato tem " + patas + " patas");
    }
}
