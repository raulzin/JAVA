public class Servico {
    private String tipo;
    private double preco;

    public Servico(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return tipo + " (R$ " + preco + ")";
    }
}
