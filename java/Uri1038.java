import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1038 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco = 0;

        sc.close();

        if (codigo == 1) {
            preco = 4.00;
        } 
        else if (codigo == 2) {
            preco = 4.50;
        }
        else if (codigo == 3) {
            preco = 5.00;
        }
        else if (codigo == 4) {
            preco = 2.00;
        }
        else if (codigo == 5) {
            preco = 1.50;
        }

        double total = preco * quantidade;

        System.out.printf("Total: R$ %.2f\n", total);
    }
 
}