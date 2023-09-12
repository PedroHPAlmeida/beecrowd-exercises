// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd
let vetor = input.map(v => parseInt(v));

// entrada
vetor.reverse();
for(let i = 0; i < vetor.length; i++) console.log(`N[${i}] = ${vetor[i]}`);