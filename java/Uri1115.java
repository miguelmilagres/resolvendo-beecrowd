import java.io.IOException;
import java.util.Scanner;

public class Uri1115 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        while (X != 0 && Y != 0)
        {
            if (X > 0) {
                if (Y > 0) {
                    System.out.println("primeiro");
                } else {
                    System.out.println("quarto");
                }
            } else {
                if (Y > 0) {
                    System.out.println("segundo");
                } else {
                    System.out.println("terceiro");
                }
            }

            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
 
}