let input = require('fs').readFileSync('dev/stdin', 'utf8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [a, b, c, d] = input.split('\n').map(n => parseInt(n));
let result = a * b - c * d;
console.log('DIFERENCA = ' + result);