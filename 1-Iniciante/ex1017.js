// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [tempo_gasto, vel_media] = input.split('\n').map(n => parseInt(n));

// processamento
let litros = (tempo_gasto * vel_media) / 12;

// saida
console.log(litros.toFixed(3));