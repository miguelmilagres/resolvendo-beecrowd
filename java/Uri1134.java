import java.io.IOException; 
import java.util.Scanner;

public class Uri1134 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int entrada = sc.nextInt();

        while (entrada != 4) {
            switch (entrada) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            entrada = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);

        sc.close();
    }
 
}