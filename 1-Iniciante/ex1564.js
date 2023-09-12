// input
let input = require('fs').readFileSync('dev/stdin', 'utf-8').split('\n');

// processing & output
input.pop();
input.forEach(v => {
    let x = parseInt(v);
    if(x === 0) console.log('vai ter copa!');
    else console.log('vai ter duas!');
});