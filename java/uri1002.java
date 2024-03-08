import java.io.IOException;
import java.util.Scanner; 
import java.util.Locale;

public class uri1002 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = Math.pow(raio, 2.0) * n;

        System.out.printf("A=%.4f%n", area);

        sc.locale();
    }
 
}