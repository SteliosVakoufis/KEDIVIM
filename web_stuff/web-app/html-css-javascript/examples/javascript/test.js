const numbers6 = [45, 4, 9, 16, 25];
let someOver18 = numbers6.some(myFunction);

console.log(someOver18);

function myFunction(value, index, array) {
  return value > 18;
} 