var express = require('express');

var app = express();

app.use('/', (req, res) => {
	// ?name=markos&surname=lalakis&age=23
	var query = req.query;
	console.log(query);
	
	var name = query.name;
	var surname = query.surname;
	var age = query.age;
	
	var length = Object.keys(query).length;
	console.log("Lenght: ", length);
	
	res.send('Name: ' + name + ' Surname: ' + surname + ' Age: ' + age);
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
