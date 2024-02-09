package ExercicioPOO4Polimorfismo;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.humorDoCachorro();
        c.cor();
        c.patas();

        //Gato

        Gato g = new Gato();
        g.cor();
        g.som();
        g.patas();
    }
}
