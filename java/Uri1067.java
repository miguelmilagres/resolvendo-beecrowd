import java.io.IOException;
import java.util.Scanner; 

public class Uri1067 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i = 0; i <= X; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d%n", i);
            }
        }
        
        sc.close();
    }
 
}