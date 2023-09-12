// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [kms, liters] = input.split('\n');

// processamento
kms = parseInt(kms);
liters = parseFloat(liters);

let avgConsum = kms / liters;

// saida
console.log(avgConsum.toFixed(3) + " km/l");