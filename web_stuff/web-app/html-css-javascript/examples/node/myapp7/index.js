var express = require('express');
var app = express();
var bodyParser = require('body-parser')

app.use(bodyParser.urlencoded({ extended: true}));

app.use('/', express.static('files'));

app.use('/userForm', (req, res) => {

	console.log(req.body);
	
	var firstname = req.body.firstname;
	var lastname = req.body.lastname;
	var email = req.body.email;
	var sex = req.body.sex;
	
	res.send('Name: ' + firstname + ' Surname: ' + lastname + ' Email: ' + email + ' Sex:' + sex);
	console.log(JSON.stringify(req.headers));
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
