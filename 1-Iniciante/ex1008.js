let input = require('fs').readFileSync('dev/stdin', 'utf8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [n, hrsTrab, valhr] = input.split('\n').map(x => parseFloat(x));

let salary = hrsTrab * valhr;
console.log('NUMBER = ' + n);
console.log('SALARY = U$ ' + salary.toFixed(2));