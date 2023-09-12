// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd
let vetor = input.map(v => parseFloat(v));

// processamento
for(let i = 0; i < vetor.length; i++){
    if(vetor[i] <= 10.0) console.log(`A[${i}] = ${vetor[i].toFixed(1)}`);
}