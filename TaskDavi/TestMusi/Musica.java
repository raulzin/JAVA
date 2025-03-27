package TestMusi;


public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

   
    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0;
        this.numAvaliacoes = 0;
    }

    
    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Média de Avaliação: " + (numAvaliacoes > 0 ? avaliacao / numAvaliacoes : "Sem avaliações"));
    }

    
    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            avaliacao += nota;
            numAvaliacoes++;
        } else {
            System.out.println("Nota inválida! A avaliação deve ser entre 0 e 10.");
        }
    }

   
    public double calcularMediaAvaliacoes() {
        return numAvaliacoes > 0 ? avaliacao / numAvaliacoes : 0;
    }
}
