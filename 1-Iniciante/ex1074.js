// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let n = parseInt(input[0]) + 1;

// processamento & saida
for(let i = 1; i < n; i++){
    let valor = parseInt(input[i]);
    let msg = '';
    if(valor === 0) msg = 'NULL';
    else{
        if(valor % 2 === 0) msg = 'EVEN';
        else msg = 'ODD';
        if(valor < 0) msg += ' NEGATIVE';
        else msg += ' POSITIVE';
    }
    console.log(msg);
}