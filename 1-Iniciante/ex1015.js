// input
let input = require('fs').readFileSync('dev/stdin', 'utf-8'); //adicionar uma barra antes do 'dev' para funcionar no beecrowd
let lines = input.split('\n');

// processing
let [x1, y1] = lines[0].split(' ').map(n => parseFloat(n));
let [x2, y2] = lines[1].split(' ').map(n => parseFloat(n));

let distance = Math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2);

// output
console.log(distance.toFixed(4));