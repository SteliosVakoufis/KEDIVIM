// (C) ASYNC CHAIN
async function add (first, second) {
  return first + second;
}
 
// (B) MULTIPLY FUNCTION
async function multiply (first, second) {
  return first * second;
}

add(2,3)
.then((added) => {
  console.log(added); // 5
  multiply(added, 5)
  .then((multiplied) => {
    console.log(multiplied); // 25
  });
});