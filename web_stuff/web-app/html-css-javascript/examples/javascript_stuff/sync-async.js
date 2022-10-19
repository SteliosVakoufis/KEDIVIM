// function add(first, second) {
//     return first + second;
// }

// function multiply(first, second) {
//     return first * second;
// }

// var result = multiply(add(2,3), 5);
// console.log(result);

async function add(first, second) {
    return first + second;
}

async function multiply(first, second) {
    return first * second;
}

// var added = add(2, 5);

// add(2, 5).then(num => multiply(num, 10).then(
//     result => console.log(result)
// ));

async function addMultiply(toAdd1, toAdd2, toMult1){
    var result = await add(toAdd1, toAdd2);
    result = await multiply(result, toMult1);

    return result;
}    

addMultiply(2, 5, 10).then(result => console.log(result));
