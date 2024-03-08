package main

import "fmt"

func main() {

	var numero int
	var horasTrabalhadas int
	var valorHora float64

	fmt.Scanf("%d", &numero)
	fmt.Scanf("%d", &horasTrabalhadas)
	fmt.Scanf("%f", &valorHora)

	salario := float64(horasTrabalhadas) * valorHora

	fmt.Printf("NUMBER = %d\n", numero)
	fmt.Printf("SALARY = U$ %.2f\n", salario)
}