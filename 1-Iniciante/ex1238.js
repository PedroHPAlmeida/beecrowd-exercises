// input
let input = require('fs').readFileSync('dev/stdin', 'utf-8').split('\n'); // adicione uma barra "/" antes do "dev" para ser aceito no beecrowd

// processing
let cases_test = parseInt(input.shift());

while(cases_test > 0){
    cases_test--;

    let [word_1, word_2] = input.shift().split(' ');
    
    const combiner = (word_x, word_y) => {
        let combined_word = String();
        let index_word_x = 0;
        let index_word_y = 0;
        let size_word_x = word_x.length;
        let size_word_y = word_y.length;

        while(size_word_x > 0 || size_word_y > 0){
            if(size_word_x > 0){
                combined_word += word_x[index_word_x++];
                size_word_x--;
            }
            if(size_word_y > 0){
                combined_word += word_y[index_word_y++];
                size_word_y--;
            }
        }
        return combined_word;
    }

    // output
    console.log(combiner(word_1, word_2));
}