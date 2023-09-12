// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento & saida
let x = parseInt(input);
if(x % 2 === 1) x++;
for(let i = 1; i < x; i += 2) console.log(i);