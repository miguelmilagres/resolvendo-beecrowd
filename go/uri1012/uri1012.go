package main
 
import (
    "fmt"
	"math"
)
 
func main() {   
	var A, B, C float64

	pi := 3.14159
	fmt.Scan(&A, &B, &C)
	
	areaTriangulo := A * C / 2
	areaCirculo := pi * math.Pow(C, 2)
	areaTrapezio := C * (A + B) / 2
	areaQuadrado := math.Pow(B, 2)
	areaRetangulo := A * B

	fmt.Printf("TRIANGULO: %.3f\n", areaTriangulo)
	fmt.Printf("CIRCULO: %.3f\n", areaCirculo)
	fmt.Printf("TRAPEZIO: %.3f\n", areaTrapezio)
	fmt.Printf("QUADRADO: %.3f\n", areaQuadrado)
	fmt.Printf("RETANGULO: %.3f\n", areaRetangulo)
}
