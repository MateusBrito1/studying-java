package ExercicioPOO3Polimorfismo;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao();
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();

        carro.frear();
        carro.acelerar();

        caminhao.acelerar();
        caminhao.frear();

        moto.acelerar();
        moto.frear();
    }
}
