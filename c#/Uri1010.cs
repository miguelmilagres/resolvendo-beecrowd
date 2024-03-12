using System;
using System.Globalization;

class Uri1010 
{
    static void Main(string[] args) 
    {
        CultureInfo.CurrentCulture = new CultureInfo("en-US");
        
        string[] e1 = Console.ReadLine().Split(' ');
        int codigo1 = int.Parse(e1[0]);
        int numero1 = int.Parse(e1[1]);
        double valor1 = double.Parse(e1[2]);
        
        string[] e2 = Console.ReadLine().Split(' ');
        int codigo2 = int.Parse(e2[0]);
        int numero2 = int.Parse(e2[1]);
        double valor2 = double.Parse(e2[2]);
        
        double pagar = numero1 * valor1 + numero2 * valor2;
        
        Console.WriteLine("VALOR A PAGAR: R$ " + pagar.ToString("F2"));
    }
}