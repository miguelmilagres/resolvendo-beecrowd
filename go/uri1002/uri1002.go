package main

import (
	"fmt"
	"math"
)
 
func main() {

    var raio float64
    pi := 3.14159

    fmt.Scanf("%f", &raio)

    area := math.Pow(raio, 2) * pi

    fmt.Printf("A=%.4f\n", area)
}
