// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento & saida
let x = parseInt(input);
if(x % 2 === 0) x++;
for(let i = x, cont = 0; cont < 6; i += 2, cont++) console.log(i);