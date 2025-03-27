public class Consulta {
    private Animal animal;
    private Funcionario funcionario;
    private String dono;
    private Servico servico;
    private String data;

    public Consulta(Animal animal, Funcionario funcionario, String dono, Servico servico, String data) {
        this.animal = animal;
        this.funcionario = funcionario;
        this.dono = dono;
        this.servico = servico;
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public String getDono() {
        return dono;
    }

    public Servico getServico() {
        return servico;
    }

    public String getData() {
        return data;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Dono: " + dono + ", Animal: " + animal.getNome() + ", Funcionário: " + funcionario.getNome() + ", Serviço: " + servico.getTipo() + ", Data: " + data;
    }
}
