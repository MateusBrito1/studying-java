package ExercicioPOO0Herança;

public class TestePessoa {

    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setCpf("3333333");
        prof.setNome("Mateus");
        prof.setIdade(15);
        prof.setSalarios(50000);

        System.out.println(prof.imprimirDadosPessoais());

        Aluno aluno = new Aluno();
        aluno.setCpf("555555");
        aluno.setNome("Brito");
        aluno.setIdade(18);
        aluno.setMatricula("Matriculado");

        System.out.println(aluno.imprimirDadosPessoais());
    }
}

