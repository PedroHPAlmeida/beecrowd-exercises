// input
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd

// processing
let column = parseInt(input.shift());
let operation = input.shift();

let matrice = new Array();

for(let i = 0; i < 12; i++){ // filling the matrice
    matrice.push(new Array());
    for(let j = 0; j < 12; j++){
        matrice[i][j] = parseFloat(input.shift());
    }
}

const operation_in_column = (mat, col, op) => {
    let sum = 0;
    for(i = 0; i < 12; i++){
        sum += mat[i][col];
    }
    if(op === 'S') return sum;
    else return sum / 12;
};

// output
console.log(operation_in_column(matrice, column, operation).toFixed(1));