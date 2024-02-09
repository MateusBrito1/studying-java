package ExercicioPOO2GettersAndSetters;

public class Idade {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 10 ) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("Não pode viajar");
        }
        this.idade = idade;
    }
}
