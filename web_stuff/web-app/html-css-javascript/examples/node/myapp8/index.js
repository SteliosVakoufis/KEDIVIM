var express = require('express');
var app = express();

app.set('view engine', 'ejs');
var bodyParser = require('body-parser')

app.use(bodyParser.urlencoded({ extended: true}));

app.use('/create', (req, res) => {
	res.render('form', {});
});

app.use('/user', (req, res) => {

	var firstname = req.body.firstname;
	var lastname = req.body.lastname;
	var email = req.body.email;
	var sex = req.body.sex;
	
	res.render('user', {name:firstname, surname:lastname, mail:email, sex:sex});
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
