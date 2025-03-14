import java.util.Scanner;

public class ControleEstoque {
    // Arrays para armazenar os dados dos produtos
    private static String[] nomesProdutos = new String[100];
    private static double[] precosProdutos = new double[100];
    private static int[] quantidadesProdutos = new int[100];
    private static int totalProdutos = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    consultarEstoque();
                    break;
                case 3:
                    registrarVenda();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

        private static void exibirMenu() {
            System.out.println("\n=== MENU DE CONTROLE DE ESTOQUE ===");
            System.out.println(" ");
            System.out.println("Cadastrar Produto");
            System.out.println(" Remover Produto");
            System.out.println("Consultar Estoque");
            System.out.println("Registrar Venda");
            System.out.println("Sair");

        }
      

        // Cadastrar um novo produto
    private static void cadastrarProduto() {
        if (totalProdutos < nomesProdutos.length) { // Verifica se ainda há espaço no array
            System.out.print("Nome do Produto: ");
            nomesProdutos[totalProdutos] = scanner.nextLine();

            System.out.print("Preço do Produto: ");
            precosProdutos[totalProdutos] = scanner.nextDouble();

            System.out.print("Quantidade do Produto: ");
            quantidadesProdutos[totalProdutos] = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            totalProdutos++; // Atualiza a contagem de produtos cadastrados
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Estoque cheio! Não é possível cadastrar mais produtos.");
        }
    }

     // Consultar todos os produtos cadastrados no estoque
     private static void consultarEstoque() {
        if (totalProdutos == 0) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("\n=== ESTOQUE ATUAL ===");
            for (int i = 0; i < totalProdutos; i++) {
                System.out.println((i + 1) + ". " + nomesProdutos[i] + " | Preço: R$" + precosProdutos[i] + " | Quantidade: " + quantidadesProdutos[i]);
            }
        }
    }

    // Registrar uma venda e atualizar o estoque
    private static void registrarVenda() {
        System.out.print("Nome do produto vendido: ");
        String nomeProduto = scanner.nextLine();

        int indiceProduto = -1;
        for (int i = 0; i < totalProdutos; i++) {
            if (nomesProdutos[i].equalsIgnoreCase(nomeProduto)) {
                indiceProduto = i;
                break;
            }
        }

        if (indiceProduto == -1) {
            System.out.println("Produto não encontrado no estoque.");
            return;
        }

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (quantidadeVendida > quantidadesProdutos[indiceProduto]) {
            System.out.println("Erro! Quantidade insuficiente no estoque.");
        } else {
            quantidadesProdutos[indiceProduto] -= quantidadeVendida;
            System.out.println("Venda registrada com sucesso!");
        }
    }
}
