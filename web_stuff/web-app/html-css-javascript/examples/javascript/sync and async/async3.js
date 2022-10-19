// (A) ASYNC ADD & MULTIPLY
async function add (first, second) {
  return first + second;
}
 
// (B) MULTIPLY FUNCTION
async function multiply (first, second) {
  return first * second;
}
 
// (X) BAD!
var result = multiply(add(2, 3), 5);
console.log(result); // PROMISE - NAN