package Introducao.ExercicioConstrutor02;

public class TesteCarro {
    public static void main(String[] args) {
        Carro fiat = new Carro("Fiat");
        Carro bmw = new Carro("V10", "Azul");
        Carro carro = new Carro();
        System.out.println(carro);
    }
}
