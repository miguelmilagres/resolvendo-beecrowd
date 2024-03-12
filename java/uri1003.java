import java.io.IOException;
import java.util.Scanner; 

public class Uri1003 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.printf("SOMA = %d%n", A + B);

        sc.close();
    }
 
}