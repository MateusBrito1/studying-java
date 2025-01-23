package ListaEncadeadaEstruturaDeDados;

public class Teste {

    public static void main(String[] args) {

        ListaEncadeada list = new ListaEncadeada();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Lista encadeada");
        list.exibirLista();
    }
}
