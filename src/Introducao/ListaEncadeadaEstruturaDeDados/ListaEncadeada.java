package Introducao.ListaEncadeadaEstruturaDeDados;

public class ListaEncadeada {

    private No primeiroNo;

    public void append(int dadoArmazenado) {
        No newNo = new No(dadoArmazenado);

        if (primeiroNo == null) {
            primeiroNo = newNo;
            return;
        }

        No temp = primeiroNo;
        while (temp.proximo != null) { // Percorre até o último nó
            temp = temp.proximo;
        }
        temp.proximo = newNo; // Adiciona o novo nó ao final.

    }

    public void exibirLista() {
        No temp = primeiroNo;
        while (temp.proximo != null) {
            System.out.println(temp.dadoArmazenado + " -> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }

    public void deletarValor(int dado) {
        if (primeiroNo == null) return;

        if (primeiroNo.dadoArmazenado == dado) {
            primeiroNo = primeiroNo.proximo;
            return;
        }

        No temp = primeiroNo;
        while (temp.proximo != null && temp.proximo.dadoArmazenado != dado) {
            temp = temp.proximo;
        }

        if (temp.proximo != null) {
            temp.proximo = temp.proximo.proximo;
        }
    }

}
