// entrada
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd

// processamento & saida
let segredo = '2002';
let senha_dig = input[0];
let pos = 1;
while(senha_dig != segredo){
    console.log('Senha Invalida');
    senha_dig = input[pos++];
}
console.log('Acesso Permitido');