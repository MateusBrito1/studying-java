package Introducao.ProgramacaoEstruturada;

public class Aula21Produto {
    int codigo;
    double preco;
    int quantidadeEstoque;
    String nome;


    void adicionarAoCarrinho(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " Unidades de " + nome + " adicionadas ao carrinho");
        } else {
            System.out.println("Quantidade insuficiente");
        }
    }

    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço R$" + preco);
        System.out.println("Estoque Atual: " + quantidadeEstoque + " unidades");
        System.out.println("Código do produto: " + codigo);
    }

    public static void main(String[] args) {
        Aula21Produto meuAula21Produto = new Aula21Produto();

        meuAula21Produto.nome = "Camisetas";
        meuAula21Produto.preco = 1500;
        meuAula21Produto.quantidadeEstoque = 20;
        meuAula21Produto.codigo = 24893589;

        meuAula21Produto.adicionarAoCarrinho(9);
        meuAula21Produto.exibirInformacoes();
    }
}
