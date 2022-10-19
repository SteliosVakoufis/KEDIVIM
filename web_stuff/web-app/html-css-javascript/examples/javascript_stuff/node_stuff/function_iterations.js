let arr = ["audi", "Fiat", "Renault"];

console.log(arr.toString());
console.log(arr.join("/"));

const num = [10, 15, 23, 22, 10];

console.log(num.map(item => item *= 2));
console.log(num.filter(item => item >= 15));
console.log(num.every(item => item >= 0));
console.log(num.some(item => item > 10));
console.log(num.indexOf(10));
console.log(num.lastIndexOf(10));
console.log(num.includes(2522));

