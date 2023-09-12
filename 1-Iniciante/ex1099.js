// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let n = parseInt(input[0]) + 1;

// processamento & saida
for(let i = 1; i < n; i++){
    let [x, y] = input[i].split(' ').map(v => parseInt(v));
    if(x > y){
        let temp = x;
        x = y;
        y = temp;
    }

    let soma = 0;
    for(let j = x + 1; j < y; j++){
        if(j % 2 === 1) soma += j;
    }
    console.log(soma);
}