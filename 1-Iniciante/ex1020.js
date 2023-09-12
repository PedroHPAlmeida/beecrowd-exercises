// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let dias = parseInt(input);

// processamento
let anos = Math.floor(dias / 365);
dias -= (anos * 365);
let meses = Math.floor(dias / 30);
dias -= (meses * 30);

// saida
console.log(`${anos} ano(s)`);
console.log(`${meses} mes(es)`);
console.log(`${dias} dia(s)`);