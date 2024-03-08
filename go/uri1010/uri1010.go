package main

import "fmt"

func main() {
	var codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2 int
	var valorPeca1, valorPeca2 float64

	fmt.Scan(&codigoPeca1, &numeroPeca1, &valorPeca1)
	fmt.Scan(&codigoPeca2, &numeroPeca2, &valorPeca2)

	preco := float64(numeroPeca1) * valorPeca1 + float64(numeroPeca2) * valorPeca2

	fmt.Printf("VALOR A PAGAR: R$ %.2f\n", preco)
}