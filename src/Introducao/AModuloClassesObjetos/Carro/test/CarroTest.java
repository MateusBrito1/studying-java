package Introducao.AModuloClassesObjetos.Carro.test;

import Introducao.AModuloClassesObjetos.Carro.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();



        carro1.cor = "Azul";
        carro1.modelo = "BMW";
        carro1.placa = "OWKJ-98HY";



        carro2.cor = "Vermelha";
        carro2.modelo = "Porsche";
        carro2.placa = "PUKJ-98HY";

        carro1 = carro2;
        System.out.println(carro2.cor + " " + carro2.modelo + " " + carro2.placa);
        System.out.println(carro1.cor + " " + carro1.modelo + " " + carro1.placa);
        System.out.println("oieeeeeeeeeeeee");
        System.out.println("hahahahahahah");





    }
}
