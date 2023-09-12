// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento
let cont_positivos = 0;
input.split('\n').map(v => {
    let x = parseFloat(v);
    if(x > 0.0) cont_positivos++;
});

// saida
console.log(cont_positivos + ' valores positivos');