let input = require('fs').readFileSync('dev/stdin', 'utf8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [nota1, nota2] = input.split('\n').map(nota => parseFloat(nota));

let media = (nota1 * 3.5 + nota2 * 7.5) / 11

console.log('MEDIA = ' + media.toFixed(5));