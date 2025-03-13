import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
}

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
}

public String getNome(){
    return nome;
}

public double getPreco(){
    return preco;
}

public int getQuantidade(){
    return quantidade;
}

public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
}