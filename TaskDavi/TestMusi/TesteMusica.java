package TestMusi;
// Removed package declaration to match the expected package structure

public class TesteMusica {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica("Bohemian Rhapsody", "Queen", 1975);

        minhaMusica.avaliar(10);
        minhaMusica.avaliar(8);
        minhaMusica.avaliar(9);

        minhaMusica.exibirFichaTecnica();

        System.out.println("Média de Avaliações: " + minhaMusica.calcularMediaAvaliacoes());
    }
}
 

