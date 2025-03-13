import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        while (scn.hasNextInt())
            int input = scn.nextInt();
            int espacos = (input-i) / 2;
            for (int i = 1; i <= input; i += 2){ // declara variavel inteiro i e para i menor ou igual a input, incrementa mais dois
                System.out.println("");
                System.out.println("*".repeat(i));
                System.out.println("".repeat(espacos)); 
                espacos--;
            }
            System.out.println("".repeat(input / 2)+ "x");
            System.out.println(" ".repeat((input - 3)) / 2); 
            System.out.println();
    }
    
}