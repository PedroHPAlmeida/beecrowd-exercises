// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let r = parseInt(input);

// processamento
const PI = 3.14159;
let volume = (4/3) * PI * Math.pow(r, 3);

// saida
console.log('VOLUME = ' + volume.toFixed(3));