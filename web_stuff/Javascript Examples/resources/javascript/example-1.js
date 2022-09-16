const BR = "<br><br>";
let space = () => document.write(BR);
let printAge = (str, num) => document.write(str + num);

let time = new Date();
document.write("The time is: ");
document.write(time);
space();

let age = 30, x1 = "The age is: ";
document.write(x1 + age);
space();

x1 = "The age is: ";
age = 35;

printAge(x1, age);
space();

