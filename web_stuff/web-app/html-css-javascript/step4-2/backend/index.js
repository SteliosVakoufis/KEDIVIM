let express = require("express");
let app = express();

const cors = require("cors");
app.use(cors({
    origin: "*"
}));

const fs = require("fs");

const bodyParser = require("body-parser");
const { json } = require("express");
app.use(bodyParser.urlencoded({ extended: true }));

app.get("/user/findAll", (req, res) => {
    console.log("Get all users");

    fs.readFile("data.json", "utf-8", (err, data) => {
        if (err)
            res.json({ "statis": false, "message": err });
        else
            var json = JSON.parse(data);

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

app.use("/user/delete", (req, res) => {
    console.log("Delete user");

    const username = req.query.username;

    fs.readFile("data.json", "utf-8", (err, data) => {
        if (err) {
            console.log(`Problem in delete user ${username}`);
        } else {
            let json = JSON.parse(data);
            json = json.data.filter((d) => {
                return d.username !== username;
            })

            json = {
                "data": json
            }

            let newdata = JSON.stringify(json);

            fs.writeFile("data.json", newdata, (err) => {
                if (err) {
                    console.log("Problem");
                } else {
                    console.log("Succesfully deleted user.");
                }
            });
            res.json({ "status": true, "data": json });
        }
    })
})

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

app.listen(3000, () => {
    console.log("Listening on port 3000");
});
