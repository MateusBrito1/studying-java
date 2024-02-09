package ExercicioPOO3Polimorfismo;

public class Carro implements Veiculo{
    @Override
    public void frear() {
        System.out.println("Freando");
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando");
    }


}
