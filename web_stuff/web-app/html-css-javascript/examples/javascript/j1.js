const myFactorial = function factorial(n){
	console.log("x3 ", n);
	if (n>1) {
		console.log("x2 ", n);
		return n * factorial(n-1) }
	else { 
		return 1 
	}
};

console.log("x1 ",myFactorial(3));