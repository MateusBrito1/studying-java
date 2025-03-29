package Introducao.AModuloClassesObjetos.Pessoa.test;

import Introducao.AModuloClassesObjetos.Pessoa.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.idade = 55;
        prof.nome = "Joao";
        prof.salario = 1500.00;

        System.out.println(prof.idade + " " +  prof.nome + " " + prof.salario);
    }
}
