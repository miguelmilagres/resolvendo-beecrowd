using System;
using System.Globalization;

class Uri1012
{
    static void Main(string[] args) 
    {
        CultureInfo.CurrentCulture = new CultureInfo("en-US");

        string[] v = Console.ReadLine().Split(' ');
        double A = double.Parse(v[0]);
        double B = double.Parse(v[1]);
        double C = double.Parse(v[2]);

        double tri = A * C / 2;
        double cir = 3.14159 * Math.Pow(C, 2);
        double tra = C * (A + B) / 2;
        double qua = B * B;
        double ret = A * B;

        Console.WriteLine("TRIANGULO: {0:F3}", tri);
        Console.WriteLine("CIRCULO: {0:F3}", cir);
        Console.WriteLine("TRAPEZIO: {0:F3}", tra);
        Console.WriteLine("QUADRADO: {0:F3}", qua);
        Console.WriteLine("RETANGULO: {0:F3}", ret);
    }
}