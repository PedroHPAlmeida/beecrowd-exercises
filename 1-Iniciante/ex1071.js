// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8');
let [x, y] = input.split('\n').map(v => parseInt(v));

// processamento
if(x > y){
    let temp = x;
    x = y;
    y = temp;
}

if(x % 2 === 0) x++;
else x += 2;

let soma = 0;
for(let i = x; i < y; i += 2) soma += i;

// saida
console.log(soma);