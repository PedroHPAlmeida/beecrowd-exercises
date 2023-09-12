// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar

// processamento & saida
let parte_inteira = parseInt(input.split('.')[0]);
let parte_decimal = parseInt(input.split('.')[1]);

// notas
console.log('NOTAS:');
console.log(`${Math.floor(parte_inteira / 100)} nota(s) de R$ 100.00`);
parte_inteira %= 100;
console.log(`${Math.floor(parte_inteira / 50)} nota(s) de R$ 50.00`);
parte_inteira %= 50;
console.log(`${Math.floor(parte_inteira / 20)} nota(s) de R$ 20.00`);
parte_inteira %= 20;
console.log(`${Math.floor(parte_inteira / 10)} nota(s) de R$ 10.00`);
parte_inteira %= 10;
console.log(`${Math.floor(parte_inteira / 5)} nota(s) de R$ 5.00`);
parte_inteira %= 5;
console.log(`${Math.floor(parte_inteira / 2)} nota(s) de R$ 2.00`);
parte_inteira %= 2;

// moedas
parte_decimal += (parte_inteira * 100);
console.log('MOEDAS:');
console.log(`${Math.floor(parte_decimal / 100)} moeda(s) de R$ 1.00`);
parte_decimal %= 100;
console.log(`${Math.floor(parte_decimal / 50)} moeda(s) de R$ 0.50`);
parte_decimal %= 50;
console.log(`${Math.floor(parte_decimal / 25)} moeda(s) de R$ 0.25`);
parte_decimal %= 25;
console.log(`${Math.floor(parte_decimal / 10)} moeda(s) de R$ 0.10`);
parte_decimal %= 10;
console.log(`${Math.floor(parte_decimal / 5)} moeda(s) de R$ 0.05`);
parte_decimal %= 5;
console.log(`${parte_decimal} moeda(s) de R$ 0.01`);