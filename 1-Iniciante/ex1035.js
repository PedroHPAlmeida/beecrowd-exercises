// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [a, b, c, d] = input.split(' ').map(n => parseInt(n));

// processamento
let aceito = false;
if(b > c){
    if(d > a){
        if(c + d > a + b){
            if(c > -1 && d > -1){
                if(a % 2 === 0){
                    aceito = true;
                }
            }
        }
    }
}

// saida
console.log(aceito ? "Valores aceitos" : "Valores nao aceitos");