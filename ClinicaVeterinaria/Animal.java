public class Animal {
    private String nome;
    private String genero;
    private String raca;
    private String tamanho;
    private int idade;

    public Animal(String nome, String genero, String raca, String tamanho, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.raca = raca;
        this.tamanho = tamanho;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Gênero: " + genero + ", Raça: " + raca + ", Tamanho: " + tamanho + ", Idade: " + idade;
    }
}
