package Introducao.ExercicioConstrutor02;

public class Carro {
    private final String modelo;
    private double ano;

    private final String motor;

    private final String cor;

    // Basicamente os que tiver no parâmetro vai ser os atributos que podem ser modificados.
    //E os que recebem como padrão não podem ser modificados
    public Carro(String modelo) {
        this.modelo = modelo; // modelo pode escolher
        this.cor = "preto"; //cor vai ser padrão preto
        this.motor = "V8";//motor padrão
        this.ano = 2001; // ano padrão
        System.out.println("A cor é " + cor + " O modelo do carro é: " + modelo + " e o motor é: " + motor + " E o ano: " + ano);
    }

    public Carro(String motor, String cor) {
        this.cor = cor; // vai poder escolher a cor
        this.motor = motor; // vai poder escolher o motor
        this.modelo = "BMW";
        this.ano = 2004;// modelo padrão
        System.out.println("A cor é " + cor + " O modelo do carro é: " + modelo + " e o motor é: " + motor);
    }

    public Carro() {
        this.modelo = "Naõ especificado";
        this.motor = "Não especificado";
        this.cor = "Não especificado";
        System.out.println("Carro não identificado.");
    }
}
