// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [cod_item, qntd_item] = input.split(' ').map(n => parseInt(n));

// processamento
let items = [[1, 4.0], [2, 4.5], [3, 5.0], [4, 2.0], [5, 1.5]];
let total_pagar = 0;
items.forEach(element => {
    if(element[0] == cod_item){
        total_pagar = element[1] * qntd_item;
    }
});

// saida
console.log(`Total: R$ ${total_pagar.toFixed(2)}`);