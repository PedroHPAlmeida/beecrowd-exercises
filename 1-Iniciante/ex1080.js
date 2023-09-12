// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n').map(v => parseInt(v)); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento
let maior = input[0];
let posicao = 0;
for(let i = 1; i < 100; i++){
    if(input[i] > maior){
        maior = input[i];
        posicao = i;
    }
}

// saida
console.log(maior);
console.log(posicao + 1);