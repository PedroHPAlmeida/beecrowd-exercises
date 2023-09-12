// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [a, b, c] = input.split(' ').map(n => parseFloat(n));

// processamento
let tri = (a * c) / 2;
let cir = 3.14159 * c ** 2;
let tra = ((a + b) * c) / 2;
let sqr = b ** 2;
let rec = a * b;

// saida
console.log('TRIANGULO: ' + tri.toFixed(3));
console.log('CIRCULO: ' + cir.toFixed(3));
console.log('TRAPEZIO: ' + tra.toFixed(3));
console.log('QUADRADO: ' + sqr.toFixed(3));
console.log('RETANGULO: ' + rec.toFixed(3));