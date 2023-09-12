let input = require('fs').readFileSync('dev/stdin', 'utf8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [nota1, nota2, nota3] = input.split('\n').map(nota => parseFloat(nota));
let media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
console.log('MEDIA = ' + media.toFixed(1));