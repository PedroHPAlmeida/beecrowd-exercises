// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar
let numbers = input.split('\n').map(n => parseFloat(n));

// processamento
let cont_positivos = soma = 0;
numbers.map(n => {
    if(n > -1){
        cont_positivos++;
        soma += n;
    }
})

// saida
console.log(`${cont_positivos} valores positivos`);
console.log((soma / cont_positivos).toFixed(1));