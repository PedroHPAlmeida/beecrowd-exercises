// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let n = parseInt(input);

// processamento & saida
if(n % 2 === 0) n++;
for(let i = 2; i < n; i += 2) console.log(`${i}^2 = ${i * i}`);