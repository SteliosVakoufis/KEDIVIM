let mongoose = require("mongoose");
let uniqueValidator = require("mongoose-unique-validator")

require("dotenv").config();
const uri = process.env.ATLAS_URI;

mongoose.connect(uri, {useNewUrlParser:true, useUnifiedTopology:true});

const connection = mongoose.connection;
connection.once("open", () => {
    console.log("Connected to Database Succesfully");
});

let Schema = mongoose.Schema;

let userSchema = new Schema({
    username:{
        type:String,
        required:[true, "Username is a required field."],
        trim:true,
        lowercse:true,
        uique:true
    },
    name:{
        type:String,
        required:[true, "Name is a required field."]
    },
    surname:{
        type:String,
        required:[true, "Surname is a required field."]
    },
    category:{
        type:String,
        required:[true, "Category is a required field."]
    },
    email:{
        type:String,
        required:[true, "Email is a required field."],
        trim:true,
        lowercase:true,
        unique:true
        ,
        match:[/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/, 
            "Email address is not valid"]
    }
});

userSchema.plugin(uniqueValidator);

module.exports = mongoose.model("User", userSchema);