// (A) ASYNC ADD
async function add (first, second) {
  return first + second;
}
 
// (B) RUN!
var added = add(2, 3);
console.log(added); // PROMISE

// A PROMISE essentially mean “the function is now running (not sure how long it will take), 
// I promise to get back to you with the results when it is done processing”. 