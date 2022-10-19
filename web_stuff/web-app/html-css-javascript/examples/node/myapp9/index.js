var express = require('express');
var app = express();
var bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: true}));

//set view engine to ejs
app.set('view engine', 'ejs');

var Customer = require('./model/Customer.js');

app.use('/createform', (req, res) => {
	console.log("Create Form Page");
	res.render('createform');
});

app.use('/create', (req, res) => {
	console.log("Create Page");
	
	var newCustomer = new Customer ({
			firstname: req.body.firstname,
			lastname: req.body.lastname,
			email: req.body.email,
			age: req.body.age,
			sex: req.body.sex,
		})
	
	newCustomer.save( (err) => {
		if (err) {
			res.render('main', {error_message:'Πρόβλημα στην καταχώρηση, προσπαθήστε ξανά', message:'', customer:''})
		} else {
			res.render('main', {error_message:'', message:'Επιτυχής Καταχώρηση', customer: newCustomer})
		}
	})
});

app.use('/updateform', (req, res) => {
	console.log("UpdateForm Page");
	
	var searchName = req.query.name;
	
	Customer.findOne({firstname:searchName}, (err, person) => {
		if (err) {
			res.render('updateform', {customer:''});
		} else {
			res.render('updateform', {customer:person});
		}
	})
});

app.use('/update', (req, res) => {
	console.log("Update Page");
	
	var searchName = req.body.firstname;
	
	Customer.findOne({firstname:searchName}, (err, person) => {
		if (err) {
			res.render('main', {error_message:'Πρόβλημα στην τροποποίηση του χρήστη, προσπαθήστε ξανά',customer:''})
		} else {
			person.firstname = req.body.firstname;
			person.lastname = req.body.lastname;
			person.email = req.body.email;
			person.age = req.body.age;
			person.sex = req.body.sex;
			
			person.save ((err) => {
				if (err) {
					res.render('main', {error_message:'Πρόβλημα στην τροποποίηση του χρήστη, προσπαθήστε ξανά', message:'', customer:''})
				} else {
					res.render('main', {error_message:'', message:'Επιτυχής Τροποποίση του χρήστη', customer: person})
				}
				
			})
		}
	})
});

app.use('/delete', (req, res) => {
	console.log("Delete Page");
	
	var searchName = req.query.name;
	
	Customer.findOneAndRemove({firstname:searchName}, (err, person) => {
		if (err) {
			res.render('main', {error_message:'Πρόβλημα στην διαγραφή του χρήστη, προσπαθήστε ξανά', message:'', customer:''})
		} else {
			res.render('main', {error_message:'', message:'Επιτυχής διαγραφή του χρήστη',customer:person})
		}
	})
	
});

app.use('/showall', (req, res) => {
	console.log("Show All Page");
	
	Customer.find( (err, allCustomers) => {
		if (err) {
			res.render('showall', {customer:''});
		} else {
			res.render('showall', {customer: allCustomers});
		}
	})
});

app.use('/', (req, res) => {
	res.render('main', {error_message:'', customer:''});
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});
