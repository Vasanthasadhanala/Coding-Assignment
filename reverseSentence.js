function reverseWords(sentence) {
  
  const words = sentence.split(' ');
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });
  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

const userInput = prompt("Enter a sentence:");
const reversedSentence = reverseWords(userInput);

console.log("Reversed sentence:", reversedSentence);
