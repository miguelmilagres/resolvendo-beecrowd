<?php

$pi = 3.14159;
$raio = fgets(STDIN);

$area = number_format(pow($raio, 2) * $pi, 4, '.', '');

echo "A={$area}\n";

?>