// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento
let piece1 = input.split('\n')[0].split(' ').map(n => parseFloat(n));
let piece2 = input.split('\n')[1].split(' ').map(n => parseFloat(n));

let total = piece1[1] * piece1[2] + piece2[1] * piece2[2];

// saida
console.log('VALOR A PAGAR: R$ ' + total.toFixed(2));