// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let casos_teste = parseInt(input[0]) + 1;

// processamento
let into = 0;
let out = 0;
for(let i = 1; i < casos_teste; i++){
    let valor = parseInt(input[i]); 
    if(valor > 9 && valor < 21) into++;
    else out++;
}

// saida
console.log(into + ' in');
console.log(out + ' out');