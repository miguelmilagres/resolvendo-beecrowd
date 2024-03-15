import java.io.IOException;
import java.util.Scanner;

public class Uri1153 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int fatorial = 1;

        for (int i = 0; i < N; i++) {
            fatorial *= (N - i);
        }

        System.out.println(fatorial);

        sc.close();
    }
 
}