/* This is Recipe.js */

var mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/myapp',{ useNewUrlParser: true });

var Schema = mongoose.Schema;

var ingredientSchema = new Schema({
		ingredient: {type: String, required: true },
		quantity: String
	})

var recipeSchema = new Schema({
		title: {type: String, required: true},
		description: {type: String, required: true},
		instruction: String,
		ingredients: [ingredientSchema] 
		// is an array of ingredientSchema objects, 
		// objects that have other objects as properties
	})

module.exports = mongoose.model('Recipe', recipeSchema)
