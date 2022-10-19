// (A) ADD FUNCTION
function add (first, second) {
  return first + second;
}
 
// (B) MULTIPLY FUNCTION
function multiply (first, second) {
  return first * second;
}
 
// (C) ADD, THEN MULTIPLY
var result = multiply(add(2, 3), 5);
console.log(result); // 25