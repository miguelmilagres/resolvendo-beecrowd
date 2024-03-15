import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1116 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A, B;

        for (int i = 0; i < N; i++) {
            A = sc.nextInt();
            B = sc.nextInt();

            if (B != 0) {
                System.out.printf("%.1f%n", (double) A/B);
            } else {
                System.out.printf("divisao impossivel%n");
            }
        }

        sc.close();
    }
 
}