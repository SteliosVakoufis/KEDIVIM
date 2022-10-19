var express = require('express');

var app = express();

app.use('/:name/:surname/:age', (req, res) => {
	var params = req.params;
	console.log(params);
	
	var name = params.name;
	var surname = params.surname;
	var age = params.age;
	
	var length = Object.keys(params).length;
	console.log("Lenght: ", length);
	
	res.send('Name: ' + name + ' Surname: ' + surname + ' Age: ' + age);
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
