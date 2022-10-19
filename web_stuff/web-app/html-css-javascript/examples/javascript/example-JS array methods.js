// Const Arrays vs Var Arrays

//----- 1o Παράδειγμα-------------------
const cars = ["Saab", "Volvo", "BMW"];
cars=["Fiat", "Alfa Romeo"]

var cars1 = ["Saab", "Volvo", "BMW"];
cars1=["Fiat", "Alfa Romeo"]

//----- 2o Παράδειγμα-------------------
// You can create a constant array:
// const cars = ["Saab", "Volvo", "BMW"];

// You can change an element:
cars[0] = "Toyota";

// You can add an element:
cars.push("Audi");

//----- 3o Παράδειγμα-------------------
// Converting Arrays to Strings
document.getElementById("demo").innerHTML = cars.toString();
// Saab,Volvo,BMW

//----- 4o Παράδειγμα-------------------
//  Join all array elements into a string
document.getElementById("demo").innerHTML = cars.join(" * ");
// Saab * Volvo * BMW

//----- 5o Παράδειγμα-------------------
// Remove the first array element and "shifts" all other elements to a lower index
const cars = ["Saab", "Volvo", "BMW"];
cars.shift();
// "Volvo", "BMW"

//----- 6o Παράδειγμα-------------------
// Adds a new element to an array (at the beginning), and "unshifts" older elements
const cars = ["Saab", "Volvo", "BMW"];
cars.shift("Toyota");
// "Toyota", "Saab", "Volvo", "BMW"

//----- 7o Παράδειγμα-------------------
// Create a new array by merging (concatenating) existing arrays
const arr1 = ["Cecilie", "Lone"];
const arr2 = ["Emil", "Tobias", "Linus"];
const arr3 = ["Robin", "Morgan"];
const myChildren = arr1.concat(arr2, arr3);

//----- 8o Παράδειγμα-------------------
// splice() method can be used to add new items to an array
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 0, "Lemon", "Kiwi");
// The first parameter (2) defines the position where new elements should be added (spliced in).
// The second parameter (0) defines how many elements should be removed.
// The rest of the parameters ("Lemon" , "Kiwi") define the new elements to be added.

// You can use splice() to remove elements without leaving "holes" in the array
fruits.splice(0, 1);
// The first parameter (0) defines the position where new elements should be added (spliced in).
// The second parameter (1) defines how many elements should be removed.

//----- 9o Παράδειγμα-------------------
// slice() method slices out a piece of an array into a new array.
const citrus = fruits.slice(1);
// This example slices out a part of an array starting from array element 1 ("Orange")