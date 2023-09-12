// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd
let n = parseInt(input);

// processamento & saida
let vetor = [];
let valor = 0;

for(let i = 0, cont = 0; cont < 1000; i++, cont++){
    if(i === n) i = 0;
    console.log(`N[${cont}] = ${i}`);
}