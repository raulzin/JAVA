package EstoqueProduto;
import java.util.Locale;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor correto
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
