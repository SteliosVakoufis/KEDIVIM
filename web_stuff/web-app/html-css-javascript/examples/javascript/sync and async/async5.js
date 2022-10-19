// (A) ADD FUNCTION
async function add (first, second) {
  return first + second;
}
 
// (B) MULTIPLY FUNCTION
async function multiply (first, second) {
  return first * second;
}

// (C) AWAIT
async function addmultiply () {
  var result = await add(2, 3);
  result = await multiply(result, 5);
  console.log(result); // 25
}
addmultiply();