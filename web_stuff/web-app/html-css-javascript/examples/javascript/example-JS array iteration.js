//----- 1o Παράδειγμα  forEach -------------------
// forEach() method calls a function (a callback function) once for each array element.
const numbers = [45, 4, 9, 16, 25];
numbers.forEach(function(x){
  console.log('tree: ' + x);
});

//----- 2o Παράδειγμα  MAP-------------------
// The map() method creates a new array by performing a function on each array element.
// The map() method does not execute the function for array elements without values.
// The map() method does not change the original array
const numbers1 = [45, 4, 9, 16, 25];
const numbers2 = numbers1.map(myFunction);

console.log(numbers2);

function myFunction(value, index, array) {
  return value * 2;
}

//----- 3o Παράδειγμα  filter -------------------
// The filter() method creates a new array with array elements that pass a test
const numbers3 = [45, 4, 9, 16, 25];
const over18 = numbers3.filter(myFunction);

console.log(over18);

function myFunction(value) {
  return value > 18;
} 

//----- 4o Παράδειγμα  reduce -------------------
// The reduce() method runs a function on each array element to produce (reduce it to) a single value.
// The reduce() method works from left-to-right in the array. See also reduceRight()
const numbers4 = [45, 4, 9, 16, 25];
let sum = numbers4.reduce(myFunction);

console.log(sum)

function myFunction(total, value) {
  return total + value;
} 
//The total (the initial value / previously returned value)
// The reduce() method can accept an initial value
// let sum = numbers.reduce(myFunction, 100);

//----- 5o Παράδειγμα every -------------------
// The every() method checks if all array values pass a test
const numbers5 = [45, 4, 9, 16, 25];
let allOver18 = numbers5.every(myFunction);

console.log(allOver18);

function myFunction(value) {
  return value > 18;
} 

//----- 6o Παράδειγμα some -------------------
// The some() method checks if some array values pass a test.
const numbers6 = [45, 4, 9, 16, 25];
let someOver18 = numbers6.some(myFunction);

console.log(someOver18);

function myFunction(value, index, array) {
  return value > 18;
} 

//----- 7o Παράδειγμα indexOf -------------------
// The indexOf() method searches an array for an element value and returns its position
const fruits = ["Apple", "Orange", "Apple", "Mango"];
let position = fruits.indexOf("Apple");

console.log(position);

//----- 8o Παράδειγμα lastIndexOf-------------------
// Array.lastIndexOf() is the same as Array.indexOf(), but returns the position of the last occurrence of the specified element.
const fruits1 = ["Apple", "Orange", "Apple", "Mango"];
let position1 = fruits1.lastIndexOf("Apple");

console.log(position);

//----- 9o Παράδειγμα find -------------------
// The find() method returns the value of the first array element that passes a test function.
const numbers7 = [4, 9, 16, 25, 29];
let first1 = numbers7.find(myFunction);

console.log(first1);

function myFunction(value) {
  return value > 18;
} 

//----- 10o Παράδειγμα findIndex-------------------
// The findIndex() method returns the index of the first array element that passes a test function.
const numbers8 = [4, 9, 16, 25, 29];
let first2 = numbers8.findIndex(myFunction);

console.log(first2);

function myFunction(value, index, array) {
  return value > 18;
} 

//----- 11o Παράδειγμα-------------------
// Array.keys() method returns an Array Iterator object with the keys of an array
const fruits2 = ["Banana", "Orange", "Apple", "Mango"];
const keys2 = fruits2.keys();

let text2 = "";

for (let x of keys2) {
  text2 += x + "\n";
}

console.log(text2);

//----- 12o Παράδειγμα-------------------
// The entries() method returns an Array Iterator object with key/value pairs
const fruits3 = ["Banana", "Orange", "Apple", "Mango"];
const keys3 = fruits3.entries();

let text3 = "";

for (let x of keys3) {
  text3 += x + "\n";
}

console.log(text3);

//----- 13o Παράδειγμα includes-------------------
// Array.includes() allows us to check if an element is present in an array
const fruits4 = ["Banana", "Orange", "Apple", "Mango"];

console.log(fruits4.includes("Mango"));