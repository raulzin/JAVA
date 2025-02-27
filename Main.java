import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int a = scanner.nextInt();

        System.out.println("Digite um valor inteiro:");
        int b = scanner.nextInt();

        int resultado = a + b;

        System.out.println("X = " + resultado);
    }
}