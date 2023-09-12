let input = require('fs').readFileSync('dev/stdin', 'utf8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd 
let [a, b] = input.split('\n').map(n => parseInt(n));

let soma = a + b;

console.log("SOMA = " + soma);
