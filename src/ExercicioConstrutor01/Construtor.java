package ExercicioConstrutor01;

public class Construtor {

    //public void nomeDoMetodo(){
    //Como é usado por padrão um método.
    //}
    private int num;

    public Construtor (int num) {
        this.num = num;
        System.out.println("idade dele é " + num);
    }
    public Construtor(int num, String name) { // Tem que ser exatamente o mesmo nome do Construtor, e ele não possue retorno, ou seja, automáticamente ele é um void.
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
