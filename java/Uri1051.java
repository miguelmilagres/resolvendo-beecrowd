import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1051 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();
        sc.close();
        double imposto;

        if (entrada >= 0 && entrada <= 2000) {
            imposto = 0;
        }
        else if (entrada > 2000 && entrada <= 3000) {
            imposto = (entrada - 2000) * 0.08;
        }
        else if (entrada > 3000 && entrada <= 4500) {
            imposto = 1000 * 0.08 + (entrada - 3000) * 0.18;
        }
        else {
            imposto = 1000 * 0.08 + 1500 * 0.18 + (entrada - 4500) * 0.28;
        }

        if (imposto != 0) {
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            System.out.printf("Isento\n");
        }
    }
 
}