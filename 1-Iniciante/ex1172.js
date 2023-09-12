// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd

// processamento & saida
let vetor = input.split('\n').map(v => parseInt(v));

for(let i = 0; i < vetor.length; i++){
    if(vetor[i] < 1) vetor[i] = 1;
    console.log(`X[${i}] = ${vetor[i]}`);
}