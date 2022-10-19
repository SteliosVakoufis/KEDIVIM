var myarray = [{x: 1, y: 2}, ["george", "sally"]];

for (let i of myarray) {
    if (Array.isArray(i)) {
        console.log(i, " is Array");
        for (let x of i ){
            console.log(x);
        }
    } else {
        console.log(i, " is Object");
        for (let x in i) {
            console.log(i[x]);
        }
    }
}

