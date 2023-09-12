// NÃO FOI ACEITO NO BEECROWD
// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd
let valor = parseFloat(input);

// processamento & saida
let vetor = [valor];
console.log(`N[0] = ${vetor[0].toFixed(4)}`);

for(let i = 1; i < 100; i++){
    vetor.push(vetor[i - 1] / 2);
    console.log(`N[${i}] = ${vetor[i].toFixed(4)}`);
}