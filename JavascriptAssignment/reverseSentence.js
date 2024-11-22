const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseWords(sentence) {
    return sentence
        .split(" ")
        .map(word => {
            let reversed = "";
            for (let i = word.length - 1; i >= 0; i--) {
                reversed += word[i];
            }
            return reversed;
        })
        .join(" ");
}

rl.question("Enter a sentence: ", (sentence) => {
    console.log("Reversed Words:", reverseWords(sentence));
    rl.close();
});
