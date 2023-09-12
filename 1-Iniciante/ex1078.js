// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let n = parseInt(input);

// processamento & saida
for(let i = 1; i < 11; i++) console.log(`${i} x ${n} = ${i * n}`);