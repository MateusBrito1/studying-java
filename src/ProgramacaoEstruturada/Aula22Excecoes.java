package ProgramacaoEstruturada;
//Tipos de exceções:
// Chcked exceptions => Compilador do Java vai exigir que você trate a exceção, que conseguimos prever.
// Unchecked exceptions => São exceções que não temos controles (não verificadas), quando o compilador não sabe que vai dar erro.
public class Aula22Excecoes {
    public static void main(String[] args) throws Exception {
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("deu ruim");
            e.printStackTrace();
        }
    }

    static void validarNumero() throws Exception {
        int num = 10;
        if(num < 100) {
            throw new Exception("Erro lançado");
        }
    }
}
