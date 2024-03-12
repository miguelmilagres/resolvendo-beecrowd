import java.io.IOException;
import java.util.Scanner;

public class Uri1044 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();
        
        if (numeroDois % numeroUm == 0 || numeroUm % numeroDois == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
 
}