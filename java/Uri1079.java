import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1079 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double media = 0.0;
        double A, B, C;

        for(int i = 0; i < N; i++) {
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            media = (2*A + 3*B + 5*C) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
 
}