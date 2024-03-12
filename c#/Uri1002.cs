using System; 

class Uri1002 {

    static void Main(string[] args) { 

        double pi = 3.14159;
        double raio = Double.Parse(Console.ReadLine());
        
        double area = pi * Math.Pow(raio, 2);
        
        Console.WriteLine($"A={area:F4}");
    }

}