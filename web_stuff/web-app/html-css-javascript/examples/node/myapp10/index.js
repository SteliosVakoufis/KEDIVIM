var express = require('express');
var app = express();
var bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: true}));

//set view engine to ejs
app.set('view engine', 'ejs');

//set upp public directory to serve static files
app.use(express.static('public'));

var Recipe = require('./model/Recipe.js');

app.use('/createform', (req, res) => {
	console.log("Create Form Page");
	res.render('createform');
});

app.use('/create_recipe', (req, res) => {
	console.log("Create Recipe Page");
	// console.log(req.body);
	var newRecipe = new Recipe(req.body)
	
	newRecipe.save( (err, result) => {
		// console.log(result)
		if (err) {
			res.render('main', {error_message:'Πρόβλημα στην καταχώρηση, προσπαθήστε ξανά', message:'', recipe:''})
		} else {
			res.render('main', {error_message:'', message:'Επιτυχής Καταχώρηση', recipe: result})
		}
	})
});

app.use('/search', (req, res) => {
	console.log("Search Page");
	res.render('search');
});

app.use('/search_recipe', (req, res) => {
	console.log("Search Recipe");
	
	if (req.body.which == 'And') {
		searchAnd(req, res)
	} else {
		searchOr(req,res);
	}

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
	res.render('main', {error_message:'', recipe:''});
});

app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});

function searchAnd(req, res){
	var query = {};
	
	if (req.body.title) 
		query.title = req.body.title;
	if (req.body.ingredient) 
		query['ingredients.ingredient'] = req.body.ingredient;
	
	console.log(query)
	
	Recipe.find(query, (err, results) => {
		console.log(results);
		if (err) {
			res.render('main', {error_message:'Πρόβλημα στην αναζήτηση, προσπαθήστε ξανά', message:'', recipe:''})
		} else {
			res.render('main', {error_message:'', message:'Επιτυχής αναζήτηση', recipe: results})
		}
	})
}

function searchOr(req, res){
	var terms = [];
	
	if (req.body.title) 
		terms.push({title: req.body.title});
	if (req.body.ingredient) 
		terms.push({'ingredients.ingredient': req.body.ingredient});
	
	var query = {$or: terms};		
	console.log(query)
	
	Recipe.find(query, (err, results) => {
		console.log(results);
		if (err) {
			res.render('main', {error_message:'Πρόβλημα στην αναζήτηση, προσπαθήστε ξανά', message:'', recipe:''})
		} else {
			res.render('main', {error_message:'', message:'Επιτυχής αναζήτηση', recipe: results})
		}
	})
}
