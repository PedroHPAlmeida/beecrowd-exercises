// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let n = parseInt(input[0]) + 1;

// processamento & saida
for(let i = 1; i < n; i++){
    let [v1, v2, v3] = input[i].split(' ').map(v => parseFloat(v));
    let media_pond = (v1 * 2 + v2 * 3 + v3 * 5) / 10;
    console.log(media_pond.toFixed(1));
}