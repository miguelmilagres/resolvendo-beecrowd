<?php

$numeroFuncionario = fgets(STDIN);
$horasTrabalhadas = fgets(STDIN);
$valorPorHora = fgets(STDIN);

$salario = number_format($horasTrabalhadas * $valorPorHora, 2, '.', '');

echo "NUMBER = {$numeroFuncionario}";
echo "SALARY = U$ {$salario}\n";

?>