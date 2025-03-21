public class Musica {
    // Atributos da classe Musica
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    // Construtor para inicializar os atributos
    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0;  // Inicializa a avaliação com 0
        this.numAvaliacoes = 0;  // Inicializa o número de avaliações com 0
    }

    // Método para exibir a ficha técnica da música
    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + (numAvaliacoes == 0 ? "Ainda não avaliada" : avaliacao));
        System.out.println("Número de Avaliações: " + numAvaliacoes);
    }

    // Método para avaliar a música
    public void avaliar(double novaAvaliacao) {
        if (novaAvaliacao < 0 || novaAvaliacao > 10) {
            System.out.println("Avaliação inválida! A avaliação deve ser entre 0 e 10.");
        } else {
            // Atualiza a média das avaliações
            avaliacao = ((avaliacao * numAvaliacoes) + novaAvaliacao) / (numAvaliacoes + 1);
            numAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        }
    }

    
    public double calcularMediaAvaliacoes() {
        return (numAvaliacoes == 0) ? 0 : avaliacao; 

    // Método principal para testar a classe
    public static void main(String[] args) {
        Musica musica = new Musica("Shape of You", "Ed Sheeran", 2017);  // Criando um objeto da classe Musica
        musica.exibirFichaTecnica();  
        musica.avaliar(8);  
        musica.avaliar(9);  

        musica.exibirFichaTecnica();  
        System.out.println("Média de Avaliações: " + musica.calcularMediaAvaliacoes());
    }
}
