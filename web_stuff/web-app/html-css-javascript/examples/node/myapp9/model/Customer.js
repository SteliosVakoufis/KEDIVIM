/* This is Customer.js */
var mongoose = require('mongoose');
require("dotenv").config();

const uri = process.env.ATLAS_URI;
mongoose.connect(uri,{useNewUrlParser:true,useUnifiedTopology: true,useCreateIndex:true});
const connection = mongoose.connection;
connection.once("open", () => {
	console.log("Connected Database Successfully");
});

var Schema = mongoose.Schema;

var customerSchema = new Schema({
		firstname: {type: String, required: true},
		lastname: {type: String, required: true},
		email: {type: String, required: true},
		age: Number,
		sex: String
	})

module.exports = mongoose.model('Customer',customerSchema)
