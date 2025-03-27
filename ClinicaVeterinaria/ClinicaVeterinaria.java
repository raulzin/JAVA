import java.util.ArrayList;
import java.util.Scanner;

public class ClinicaVeterinaria {
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Dono> donos = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Consulta> consultas = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();

    public ClinicaVeterinaria() {
        // Adiciona os serviços da clínica
        servicos.add(new Servico("Vacinação", 50.0));
        servicos.add(new Servico("Castração", 150.0));
        servicos.add(new Servico("Exames de Sangue", 100.0));
        servicos.add(new Servico("Remoção de Tártaro", 80.0));
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void atualizarAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Atualizando informações do animal: " + nome);
                System.out.print("Novo Nome: ");
                animal.setNome(scanner.nextLine());
                System.out.print("Novo Gênero: ");
                animal.setGenero(scanner.nextLine());
                System.out.print("Nova Raça: ");
                animal.setRaca(scanner.nextLine());
                System.out.print("Novo Tamanho: ");
                animal.setTamanho(scanner.nextLine());
                System.out.print("Nova Idade: ");
                animal.setIdade(scanner.nextInt());
                System.out.println("Animal atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    public void excluirAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                animais.remove(animal);
                System.out.println("Animal removido com sucesso!");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    public void adicionarDono(Dono dono) {
        donos.add(dono);
    }

    public void atualizarDono(String cpf) {
        for (Dono dono : donos) {
            if (dono.getCpf().equals(cpf)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Atualizando informações do dono: " + cpf);
                System.out.print("Novo Nome: ");
                dono.setNome(scanner.nextLine());
                System.out.print("Novo Telefone: ");
                dono.setTelefone(scanner.nextLine());
                System.out.print("Novo Endereço: ");
                dono.setEndereco(scanner.nextLine());
                System.out.println("Dono atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Dono não encontrado.");
    }

    public void excluirDono(String cpf) {
        for (Dono dono : donos) {
            if (dono.getCpf().equals(cpf)) {
                donos.remove(dono);
                System.out.println("Dono removido com sucesso!");
                return;
            }
        }
        System.out.println("Dono não encontrado.");
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void atualizarFuncionario(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Atualizando informações do funcionário: " + cpf);
                System.out.print("Novo Nome: ");
                funcionario.setNome(scanner.nextLine());
                System.out.print("Novo Telefone: ");
                funcionario.setTelefone(scanner.nextLine());
                System.out.print("Novo Horário: ");
                funcionario.setHorario(scanner.nextLine());
                System.out.print("Novo Endereço: ");
                funcionario.setEndereco(scanner.nextLine());
                System.out.print("Nova Área de Atuação: ");
                funcionario.setAreaAtuacao(scanner.nextLine());
                System.out.println("Funcionário atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void excluirFuncionario(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário removido com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void atualizarConsulta(String dono, String animal) {
        for (Consulta consulta : consultas) {
            if (consulta.getDono().equals(dono) && consulta.getAnimal().getNome().equals(animal)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Atualizando informações da consulta do animal: " + animal + " do dono: " + dono);
                System.out.print("Novo Veterinário: ");
                consulta.setFuncionario(new Funcionario(scanner.nextLine(), "", "", "", "", ""));
                System.out.print("Novo Serviço: ");
                consulta.setServico(new Servico(scanner.nextLine(), 0.0));
                System.out.print("Nova Data: ");
                consulta.setData(scanner.nextLine());
                System.out.println("Consulta atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Consulta não encontrada.");
    }

    public void excluirConsulta(String dono, String animal) {
        for (Consulta consulta : consultas) {
            if (consulta.getDono().equals(dono) && consulta.getAnimal().getNome().equals(animal)) {
                consultas.remove(consulta);
                System.out.println("Consulta removida com sucesso!");
                return;
            }
        }
        System.out.println("Consulta não encontrada.");
    }

    public void exibirHistoricoConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }

    public void mostrarServicos() {
        for (Servico servico : servicos) {
            System.out.println(servico);
        }
    }

    public static void main(String[] args) {
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Atualizar Animal");
            System.out.println("3. Excluir Animal");
            System.out.println("4. Cadastrar Dono");
            System.out.println("5. Atualizar Dono");
            System.out.println("6. Excluir Dono");
            System.out.println("7. Cadastrar Funcionário");
            System.out.println("8. Atualizar Funcionário");
            System.out.println("9. Excluir Funcionário");
            System.out.println("10. Agendar Consulta");
            System.out.println("11. Atualizar Consulta");
            System.out.println("12. Excluir Consulta");
            System.out.println("13. Ver Histórico de Consultas");
            System.out.println("14. Mostrar Serviços");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Animal: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();
                    System.out.print("Tamanho: ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    Animal animal = new Animal(nome, genero, raca, tamanho, idade);
                    clinica.adicionarAnimal(animal);
                    break;
                case 2:
                    System.out.print("Nome do Animal a ser atualizado: ");
                    String nomeAnimalAtualizar = scanner.nextLine();
                    clinica.atualizarAnimal(nomeAnimalAtualizar);
                    break;
                case 3:
                    System.out.print("Nome do Animal a ser excluído: ");
                    String nomeAnimalExcluir = scanner.nextLine();
                    clinica.excluirAnimal(nomeAnimalExcluir);
                    break;
                case 4:
                    System.out.print("Nome do Dono: ");
                    String nomeDono = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfDono = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneDono = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoDono = scanner.nextLine();
                    Dono dono = new Dono(nomeDono, cpfDono, telefoneDono, enderecoDono);
                    clinica.adicionarDono(dono);
                    break;
                case 5:
                    System.out.print("CPF do Dono a ser atualizado: ");
                    String cpfDonoAtualizar = scanner.nextLine();
                    clinica.atualizarDono(cpfDonoAtualizar);
                    break;
                case 6:
                    System.out.print("CPF do Dono a ser excluído: ");
                    String cpfDonoExcluir = scanner.nextLine();
                    clinica.excluirDono(cpfDonoExcluir);
                    break;
                case 7:
                    System.out.print("Nome do Funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfFuncionario = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneFuncionario = scanner.nextLine();
                    System.out.print("Horário: ");
                    String horarioFuncionario = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String enderecoFuncionario = scanner.nextLine();
                    System.out.print("Área de Atuação: ");
                    String areaAtuacaoFuncionario = scanner.nextLine();
                    Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, telefoneFuncionario, horarioFuncionario, enderecoFuncionario, areaAtuacaoFuncionario);
                    clinica.adicionarFuncionario(funcionario);
                    break;
                case 8:
                    System.out.print("CPF do Funcionário a ser atualizado: ");
                    String cpfFuncionarioAtualizar = scanner.nextLine();
                    clinica.atualizarFuncionario(cpfFuncionarioAtualizar);
                    break;
                case 9:
                    System.out.print("CPF do Funcionário a ser excluído: ");
                    String cpfFuncionarioExcluir = scanner.nextLine();
                    clinica.excluirFuncionario(cpfFuncionarioExcluir);
                    break;
                case 10:
                    System.out.print("Nome do Dono: ");
                    String nomeDonoConsulta = scanner.nextLine();
                    System.out.print("Nome do Animal: ");
                    String nomeAnimalConsulta = scanner.nextLine();
                    System.out.print("Nome do Veterinário: ");
                    String nomeVeterinarioConsulta = scanner.nextLine();
                    System.out.print("Serviço: ");
                    String servicoConsulta = scanner.nextLine();
                    System.out.print("Data: ");
                    String dataConsulta = scanner.nextLine();
                    Animal animalConsulta = null;
                    Funcionario veterinarioConsulta = null;
                    Servico servicoObjConsulta = null;
                    for (Animal a : clinica.animais) {
                        if (a.getNome().equals(nomeAnimalConsulta)) {
                            animalConsulta = a;
                            break;
                        }
                    }
                    for (Funcionario f : clinica.funcionarios) {
                        if (f.getNome().equals(nomeVeterinarioConsulta)) {
                            veterinarioConsulta = f;
                            break;
                        }
                    }
                    for (Servico s : clinica.servicos) {
                        if (s.getTipo().equals(servicoConsulta)) {
                            servicoObjConsulta = s;
                            break;
                        }
                    }
                    if (animalConsulta != null && veterinarioConsulta != null && servicoObjConsulta != null) {
                        Consulta consulta = new Consulta(animalConsulta, veterinarioConsulta, nomeDonoConsulta, servicoObjConsulta, dataConsulta);
                        clinica.agendarConsulta(consulta);
                    } else {
                        System.out.println("Erro ao agendar consulta. Verifique se todos os dados estão corretos.");
                    }
                    break;
                case 11:
                    System.out.print("Nome do Dono: ");
                    String nomeDonoConsultaAtualizar = scanner.nextLine();
                    System.out.print("Nome do Animal: ");
                    String nomeAnimalConsultaAtualizar = scanner.nextLine();
                    clinica.atualizarConsulta(nomeDonoConsultaAtualizar, nomeAnimalConsultaAtualizar);
                    break;
                case 12:
                    System.out.print("Nome do Dono: ");
                    String nomeDonoConsultaExcluir = scanner.nextLine();
                    System.out.print("Nome do Animal: ");
                    String nomeAnimalConsultaExcluir = scanner.nextLine();
                    clinica.excluirConsulta(nomeDonoConsultaExcluir, nomeAnimalConsultaExcluir);
                    break;
                case 13:
                    clinica.exibirHistoricoConsultas();
                    break;
                case 14:
                    clinica.mostrarServicos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
