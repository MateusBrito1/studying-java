package ExercicioPOO1Encapsulamento;

public class TesteRedeSocial {
    public static void main(String[] args) {

        RedeSocial redeSocial = new RedeSocial();
        redeSocial.setDm("Mariana");
        redeSocial.setBlocks(5);
        redeSocial.minhasDms();
        redeSocial.follow = 49;

        System.out.println(redeSocial.getBlocks());
    }
}
