import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1041 {
 
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        sc.close();

        String saida;

        if (X > 0) {
            if (Y > 0) {
                saida = "Q1";
            }
            else if (Y < 0) {
                saida = "Q4";
            }
            else {
                saida = "Eixo Y";
            }
        } 
        else if (X < 0) {
            if (Y > 0) {
                saida = "Q2";
            }
            else if (Y < 0) {
                saida = "Q3";
            } 
            else {
                saida = "Eixo X";
            }
        }
        else {
            if (Y != 0) {
                saida = "Eixo Y";
            } else {
                saida = "Origem";
            }
        }
        
        System.out.println(saida);
    }
 
}