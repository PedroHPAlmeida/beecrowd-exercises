let raio = parseFloat(require("fs").readFileSync("dev/stdin", "utf8")); //adicionar uma barra antes do 'dev' para funcionar no beecrowd 
const PI = 3.14159;
let area = Math.pow(raio, 2) * PI;

console.log("A=" + area.toFixed(4));