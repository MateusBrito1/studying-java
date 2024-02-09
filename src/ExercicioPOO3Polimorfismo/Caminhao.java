package ExercicioPOO3Polimorfismo;

public class Caminhao implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("O caminhão está Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }
}
