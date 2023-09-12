// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n').map(v => parseInt(v)); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd
let n = input.shift();

// processamento & saida
for(let i = 0; i < n; i++){
    let valor = input.shift();
    let enesimo_fib = fibonacci(valor);
    console.log(`Fib(${valor}) = ${enesimo_fib}`); 
}

function fibonacci(n){
    if(n === 0) return 0;
    else if(n === 1) return 1;
    
    let n_menos_2 = 0;
    let n_menos_1 = 1;
    let atual = n_menos_2 + n_menos_1;
    for(let i = 3; i <= n; i++){
        n_menos_2 = n_menos_1;
        n_menos_1 = atual;
        atual = n_menos_2 + n_menos_1;
    }
    return atual;
}