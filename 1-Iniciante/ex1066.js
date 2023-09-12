// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento
let cont_pares = 0;
let cont_impares = 0;
let cont_positivos = 0;
let cont_negativos = 0;

for(let i = 0; i < 5; i++){
    let elem = parseInt(input.shift());
    if(elem % 2 === 0) cont_pares++;
    else cont_impares++;
    if(elem > 0) cont_positivos++;
    else if(elem < 0) cont_negativos++; 
}

// saida
console.log(cont_pares + ' valor(es) par(es)');
console.log(cont_impares + ' valor(es) impar(es)');
console.log(cont_positivos + ' valor(es) positivo(s)');
console.log(cont_negativos + ' valor(es) negativo(s)');