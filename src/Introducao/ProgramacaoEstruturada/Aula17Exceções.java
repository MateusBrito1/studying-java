package Introducao.ProgramacaoEstruturada;

public class Aula17Exceções {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (Exception e) { // CAPTURA DA POSSÍVEL exceção.
            //TRATAMENTO DA exceção.
            System.out.println("A frase inicial está nula, voltará ao default");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        } finally {
            System.out.println("Frase antiga " + frase);
            System.out.println("Frase nova " + novaFrase);
        }
    }
}
