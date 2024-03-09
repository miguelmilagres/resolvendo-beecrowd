import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class uri1012 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String linha = sc.nextLine();
        String[] elemento = linha.split(" ");

        double pi = 3.14159;
        double A = Double.parseDouble(elemento[0]);
        double B = Double.parseDouble(elemento[1]);
        double C = Double.parseDouble(elemento[2]);

        double areaTriangulo = A * C / 2;
        double areaCirculo = pi * Math.pow(C, 2.0);
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = Math.pow(B, 2.0);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
 
}