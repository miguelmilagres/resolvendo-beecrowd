import java.io.IOException;
import java.util.Scanner;

public class Uri1046 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int duracao;

        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        System.out.printf("O JOGO DUROU %d HORAS(S)\n", duracao);
        
        sc.close();
    }
 
}