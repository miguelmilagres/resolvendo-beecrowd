import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class uri1008 {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        
        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroFuncionario, salario);
 
        sc.close();
    }
 
}