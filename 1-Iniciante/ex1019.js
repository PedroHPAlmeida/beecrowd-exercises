// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let segundos = parseInt(input);

// processamento
let horas = Math.floor(segundos / 3600);
segundos -= (horas * 3600);
let minutos = Math.floor(segundos / 60);
segundos -= (minutos * 60);

// saida
console.log(`${horas}:${minutos}:${segundos}`);