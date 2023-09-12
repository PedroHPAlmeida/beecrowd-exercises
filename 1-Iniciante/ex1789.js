// input
let input = require('fs').readFileSync('dev/stdin', 'utf-8').split('\n'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd

// processing

while(true){
    let n_slugs = parseInt(input.shift());
    if(input.length === 0) break;
    let higher_speed = Math.max.apply(null, (input.shift().split(' ').map(v => parseInt(v))));
    
    // output
    if(higher_speed < 10) console.log(1);
    else if(higher_speed < 20) console.log(2);
    else console.log(3);
    
}