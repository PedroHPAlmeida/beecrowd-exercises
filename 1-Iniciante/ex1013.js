// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [a, b, c] = input.split(' ').map(n => parseInt(n));

// processamento
let larger = (a + b + Math.abs(a - b)) / 2;
larger = (larger + c + Math.abs(larger - c)) / 2;

// saida
console.log(larger + ' eh o maior');