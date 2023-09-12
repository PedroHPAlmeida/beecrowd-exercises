// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento
let cont_pares = 0;
input.split('\n').map(v => {
    let x = parseInt(v);
    if(x % 2 === 0) cont_pares++; 
});

// saida
console.log(cont_pares + ' valores pares');