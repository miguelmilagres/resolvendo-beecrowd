import java.io.IOException;
import java.util.Scanner;

public class Uri1157 {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
        if (N % i == 0) {
            System.out.println(i);
        }
    }

    sc.close();
    }
 
}