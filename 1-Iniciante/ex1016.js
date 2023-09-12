// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento e saida
console.log(`${Number(input) * 2} minutos`);