import java.io.IOException;
import java.util.Scanner; 

public class Uri1072 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X;
        int in = 0;
        int out = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            if (X <= 20 && X >= 10) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
 
}