// saida
let j = 1.0;
for(let i = 0.0; i < 2.0; i += 0.2){
    for(let cont = 0; cont < 3; cont++, j++){
        const verificar_inteiro = (n) => {
            let num_str = n.toFixed(1) + '';
            if(num_str.charAt(2) === '0') return true;
            return false;
        };
        if(verificar_inteiro(i)) console.log(`I=${i.toFixed(0)} J=${j.toFixed(0)}`);
        else console.log(`I=${i.toFixed(1)} J=${j.toFixed(1)}`);
    }
    j -= 2.8;
}