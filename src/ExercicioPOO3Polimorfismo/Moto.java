package ExercicioPOO3Polimorfismo;

public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }
}
