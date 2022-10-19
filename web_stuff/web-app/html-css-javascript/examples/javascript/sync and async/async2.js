// (A) ASYNC ADD
async function add (first, second) {
  return first + second;
}
 
// (B) RUN ASYNC FUNCTION
add(2, 3)
 
// (C) THEN RESOLVE RESULT ON COMPLETE
.then((result) => { console.log(result); })
 
// (D) OPTIONAL - CATCH ERRORS
.catch((err) => { console.log(error); })
 
// (E) OPTIONAL - FINALLY
.finally(() => { console.log("Finally"); });


// then() This will be triggered when the processing is complete.
// catch() Optional. Handle errors.
// finally() Optional. This will run at the end, regardless of success or error. 