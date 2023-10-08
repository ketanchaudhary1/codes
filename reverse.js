function reverseWordsInString(input) {
    let words = input.split(' ');
    let reversedWords = words.map(word => word.split('').reverse().join(''));
    let reversedString = reversedWords.join(' ');
    return reversedString;
}
let originalString = "Hello, World!";
let reversedString = reverseWordsInString(originalString);
console.log("Original: " + originalString);
console.log("Reversed: " + reversedString);
