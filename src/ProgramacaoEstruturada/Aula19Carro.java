package ProgramacaoEstruturada;

public class Aula19Carro {

    String cor;
    String modelo;

    String motor;
    int velocidadeAtual;

    void acelerar() {
        velocidadeAtual += 30;
    }

    void frear() {
        velocidadeAtual -= 5;
    }

    void buzinar() {
        System.out.println("Buzinando");
    }


    public static void main(String[] args) {

        Aula19Carro meuCarro = new Aula19Carro();

        meuCarro.cor = "Azul";
        meuCarro.modelo = "BMW";
        meuCarro.motor = "V8";

        meuCarro.acelerar();
        meuCarro.buzinar();

        System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
        System.out.println("Moto do meu carro é: " + meuCarro.motor);
    }
}
