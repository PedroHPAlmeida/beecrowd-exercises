// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento & saida
let pos = 0;
while(true){
    let [x, y] = input[pos].split(' ').map(v => parseInt(v));
    if(x <= 0 || y <= 0) break; // condicao de parada
    //console.log(x + ' ' + y);
    if(x > y){
        let temp = x;
        x = y;
        y = temp;
    }
    print_valores(x, y);
    pos++;
}

function print_valores(inf, sup){
    let sum = inf;
    let str_print = inf;
    inf++;
    sup++;
    for(let i = inf; i < sup; i++){
        str_print += ' ' + i;
        sum += i;
    }
    console.log(`${str_print} Sum=${sum}`);
}