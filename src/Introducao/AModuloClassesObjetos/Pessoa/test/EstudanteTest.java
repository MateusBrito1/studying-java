package Introducao.AModuloClassesObjetos.Pessoa.test;

import Introducao.AModuloClassesObjetos.Pessoa.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 20;
        estudante.sexo = "Masculino";
        estudante.matricula = 466846;

        System.out.println(estudante);
    }
}
