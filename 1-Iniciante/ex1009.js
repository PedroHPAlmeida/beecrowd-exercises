// entrada
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let [name, salary, sales] = input.split('\n');

// processamento
salary = parseFloat(salary);
sales = parseFloat(sales);
salary += (sales * 0.15);

//saida
console.log('TOTAL = R$ ' + salary.toFixed(2));