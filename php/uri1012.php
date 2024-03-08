<?php

$pi = 3.14159;
$valor = explode(" ", fgets(STDIN), 3);

$areaTriangulo = number_format($valor[0] * $valor[2] / 2, 3, '.', '');
$areaCirculo = number_format(pow($valor[2], 2) * $pi, 3, '.', '');
$areaTrapezio = number_format(($valor[0] + $valor[1]) * $valor[2] / 2, 3, '.', '');
$areaQuadrado = number_format(pow($valor[1], 2), 3, '.', '');
$areaRetangulo = number_format($valor[0] * $valor[1], 3, '.', '');

echo "TRIANGULO: {$areaTriangulo}\n";
echo "CIRCULO: {$areaCirculo}\n";
echo "TRAPEZIO: {$areaTrapezio}\n";
echo "QUADRADO: {$areaQuadrado}\n";
echo "RETANGULO: {$areaRetangulo}\n";

?>