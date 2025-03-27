public class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private String horario;
    private String endereco;
    private String areaAtuacao;

    public Funcionario(String nome, String cpf, String telefone, String horario, String endereco, String areaAtuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.horario = horario;
        this.endereco = endereco;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + ", Horário: " + horario + ", Endereço: " + endereco + ", Área de Atuação: " + areaAtuacao;
    }
}
