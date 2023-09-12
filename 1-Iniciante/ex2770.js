// input (NAO FOI ACEITO PELO BEECROWD)
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let lines = input.split('\n');

while(lines.length > 0){
    var [x, y, m] = lines.shift().split(' ').map(n => parseInt(n));
    var largeVal = x > y ? x : y;

    for(let i = 0; i < m; i++){
        var [xi, yi] = lines.shift().split(' ').map(n => parseInt(n));
        var largeValI = xi > yi ? xi : yi;

        // processing & output
        if(largeValI > largeVal){
            console.log('Nao');
        } 
        else{
            console.log('Sim');
        }
    }
}