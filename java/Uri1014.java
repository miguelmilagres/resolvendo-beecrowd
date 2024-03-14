import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1014 {
 
    public static void main(String[] args) throws IOException 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double consumo = X / Y;

        System.out.printf("%.3f km/l\n", consumo);

        sc.close();
    }
 
}