var express = require('express');
var app = express();

const fs = require('fs');

// Αρχικά χωρίς bodyparser
const bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: true}));

// Αρχικά χωρίς cors
const cors = require('cors');

app.use(cors({
    origin: '*'
    // origin: ['https://www.section.io', 'https://www.google.com/']
}));


app.get('/user/findAll', (req, res) => {

    console.log("Get users data");
	
    fs.readFile('data.json', 'utf8', function (err, data) {
        if (err) throw err;
        var json = JSON.parse(data);
        
        res.send(json);
    });
});

app.get('/user/findOne', (req, res) => {

    console.log("Find user");

    const username = req.query.username;

    console.log("Find user with username:", username);

    fs.readFile('data.json', 'utf8', function (err, data) {
        if (err) throw err;
        
        var json = JSON.parse(data);
        
        item = json.data.find(x => x.username === username);
        
        res.send(item);
    });
});

app.delete('/user/delete', (req, res) => {

    console.log("Delete user");

    const username = req.query.username;

    console.log("delete user with username:", username);

    fs.readFile('data.json', 'utf8', function (err, data) {
        if (err) throw err;
        
        var json = JSON.parse(data);
        
        json = json.data.filter(function(d) { 
            return d.username !== username;  
        });

        // console.log("X1>", json);

        json = {
            "data": json
        };
        // console.log("X2>>",newdata);

        newdata = JSON.stringify(json);

        // console.log("X3>>",newdata);

        fs.writeFile('data.json', newdata, err => {
            if (err) {
                console.log('Error deleting object from file', err)
            } else {
                console.log('Successfully deleting object fromfile')
            }
        });
        
        res.send(json);
    });
});

app.post('/user/create', (req, res) => {

    console.log("Insert user");

    const username = req.body.username;
    const name = req.body.name;
    const surname = req.body.surname;
    const category = req.body.category;
    const email = req.body.email;

    console.log("insert user with username:", username);

    fs.readFile('data.json', 'utf8', function (err, data) {
        if (err) throw err;
        
        var json = JSON.parse(data);
        json = json.data;

        // console.log("X1>", json);

        const item = {
            'username': username,
            'name': name,
            'surname': surname,
            'category': category,
            'email': email
        }
        // console.log("X2>>",item);
        json.push(item);
        
        json = {
            "data": json
        };

        newdata = JSON.stringify(json);

        // console.log("X3>>",newdata);

        fs.writeFile('data.json', newdata, err => {
            if (err) {
                console.log('Error inserting object to file', err)
            } else {
                console.log('Successfully inserting object to file')
            }
        });
        
        res.send(json);
    });
});

app.post('/user/update', (req, res) => {

    console.log("update user");

    const username = req.body.username;
    const name = req.body.name;
    const surname = req.body.surname;
    const category = req.body.category;
    const email = req.body.email;

    console.log("Update user with username:", username);

    fs.readFile('data.json', 'utf8', function (err, data) {
        if (err) throw err;
        
        var json = JSON.parse(data);
        json = json.data;

        // console.log("X1>", json);

        const items = json.map(obj => {
            if (obj.username === username) {
                return {...obj, name: name, surname: surname, category: category, email: email};
            }
            return obj;
        });
        
        json = {
            "data": items
        };

        newdata = JSON.stringify(json);

        // console.log("X2>>",newdata);

        fs.writeFile('data.json', newdata, err => {
            if (err) {
                console.log('Error Updating object to file', err)
            } else {
                console.log('Successfully Updating object to file')
            }
        });
        
        res.send(json);
    });
});


app.listen(3000, ()=> {
	console.log('Listening on port 3000');
});

