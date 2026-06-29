const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
let answer = "";

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    n = Number(input[0]);
        if(n%2===0) {
            answer += n+" is even";
        }else answer+= n + " is odd";
    console.log(answer);
});
