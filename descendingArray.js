function sortArrayDescending(arr) {
  arr.sort(function(a, b) {
    return b - a; 
  });

  return arr;
}

const userInput = prompt("Enter array elements separated by commas:");
const inputArray = userInput.split(',').map(Number); 

const sortedArray = sortArrayDescending(inputArray);

console.log("Sorted array in descending order:", sortedArray);
