package ProgramacaoEstruturada;

public class Produto {
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

    void exibirInformações() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço R$" + preco);
        System.out.println("Estoque Atual: " + quantidadeEstoque + " unidades");
        System.out.println("Código do produto: " + codigo);
    }

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.nome = "Camisetas";
        meuProduto.preco = 1500;
        meuProduto.quantidadeEstoque = 20;
        meuProduto.codigo = 24893589;

        meuProduto.adicionarAoCarrinho(9);
        meuProduto.exibirInformações();
    }
}
