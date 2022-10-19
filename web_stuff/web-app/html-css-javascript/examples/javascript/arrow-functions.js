hello1 = function() {
  return "Hello World! 1";
}
console.log(hello1());

hello2 = () => {
  return "Hello World! 2";
}
console.log(hello2());

hello3 = () => "Hello World! 3"; 
console.log(hello3());

hello4 = (val) => "Hello " + val;
console.log(hello4("World! 4"));

// Arrow Function
calc = (a, b) => a + b + 100;

console.log(calc(3, 7));