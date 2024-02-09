package ExercicioPOO1Encapsulamento;

public class RedeSocial {

    private String dm;
    public double follow;
    private double blocks;

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public double getBlocks() {
        return blocks;
    }

    public void setBlocks(double blocks) {
        this.blocks = blocks;
    }

    void minhasDms () {
        if (dm != null && dm.contains("Mariana")) {
            System.out.println("Não mostrar");
        } else {
            System.out.println("Mostrar");
        }
    }
}
