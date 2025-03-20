package AlunoNotas;
import java.util.Locale;
import java.util.Scanner;

public class Média {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Digite a primeira nota");
        float N1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota");
        float N2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota");
        float N3 = scanner.nextFloat();

        System.out.println("Digite a quarta nota");
        float N4 = scanner.nextFloat();

        float Media = ((N1*2)+(N2*3)+(N3*4)+(N4*1)) / 10;

    
        
        System.out.println("Media:" +Media);
        if (Media>=7){
            System.out.println("Aluno Aprovado");
        } else if ( Media < 5) {
            System.out.println("Aluno Reprovado");
        } else {
            System.out.println("Aluno em exame");
            float exame = scanner.nextFloat();
            System.out.println("Nota do exame:"+exame);
            Media = (Media + exame) / 2;
            if (Media >=5) {
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Aluno Reprovado");
            }
        }
    }
}
