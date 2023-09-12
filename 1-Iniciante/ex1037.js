// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let numero = parseFloat(input);

// processamento & saida
if(numero < 0.0 || numero > 100.0) console.log("Fora de intervalo");
else if(numero <= 25.0) console.log('Intervalo [0,25]');
else if(numero <= 50.0) console.log('Intervalo (25,50]');
else if(numero <= 75.0) console.log('Intervalo (50, 75]');
else console.log("Intervalo (75,100]");