import java.io.IOException;
import java.util.Scanner;

public class Uri1143 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d%n", i, i*i, i*i*i);
        }

        sc.close();
    }
 
}