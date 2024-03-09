import java.io.IOException;
import java.util.Scanner; 
import java.util.Locale;

public class uri1010 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String primeiraLinha = sc.nextLine();
        String segundaLinha = sc.nextLine();

        String[] primeiroElemento = primeiraLinha.split(" ");
        String[] segundoElemento = segundaLinha.split(" ");

        double preco = Double.parseDouble(primeiroElemento[1]) * Double.parseDouble(primeiroElemento[2]) + Double.parseDouble(segundoElemento[1]) * Double.parseDouble(segundoElemento[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", preco);
    }
 
}