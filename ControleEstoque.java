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
            System.out.println("Consultar Estoque");
            System.out.println("Registrar Venda");
            System.out.println("Sair");

        }
      

        private static void cadastrarProduto(Scanner scanner) {
            System.out.println("Nome do Produto");
            String nomesProdutos = scanner.nextLine();
    
            System.out.println("Preço do Produto");
            double nomesProdutos = scanner.nextDouble();
    
            System.out.println("Quantidade do Produto");
            int quantidadesProdutos= scanner.nextInt();
        }


        private static void consultarEstoque() {}


        private static void registrarVenda(Scanner scanner) {}


        } 