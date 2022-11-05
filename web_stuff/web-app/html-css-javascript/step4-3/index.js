let express = require("express");
let app = express();

let bodyParser = require("body-parser");
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

const cors = require("cors");
const User = require("./model/User");

app.use(cors({
    origin: "*"
}));

app.use("/", express.static("./Files"));

app.get("/user/findAll", (req, res) => {
    console.log("Get all users");

    User.find((err, allUsers) => {
        if (err) {
            console.log(`Error in find all users {err}`);
            res.json({ "status": false, "data": err });
        } else {
            res.json({ "status": true, "data": allUsers });
        }
    });
});

app.get("/user/findOne", (req, res) => {
    console.log("Gett one user");

    const username = req.query.username;
    console.log(`Find user with username: ${username}`);

    User.findOne({ "username": username }, (err, user) => {
        if (err) {
            console.log(`Error in finding user. {err}`);
            res.json({ "status": true, "data": username });
        } else {
            res.json({ "status": true, "data": user });
        }
    });

});

app.get("/user/create", (req, res) => {
    console.log("Insert User", req.query.username);

    const username = req.query.username;
    console.log(`Insert user with username: ${username}`);

    let newUser = new User({
        username: username,
        name: req.query.name,
        surname: req.query.surname,
        category: req.query.category,
        email: req.query.email
    });

    newUser.save((err) => {
        if (err) {
            console.log(`Error in inserting user ${err}`);
            res.json({ "data": err, "status": false });
        } else {
            res.json({ "data": newUser, "status": true });
        }
    });
});

app.delete("/user/delete", (req, res) => {
    console.log("Deleting user", req.query.username);

    const username = req.query.username;
    console.log("Delete user " + username);

    User.findOneAndRemove({ "username": username }, (err, user) => {
        if (err) {
            console.log(err);
            res.json({ "status": false, "data": err });
        } else {
            res.json({ "status": true, "data": user });
        }
    });
});

app.post("/user/update", async (req, res) => {
    console.log("Updating user", req.body.username);

    const username = req.body.username;

    const filter = { "username": username };
    const update = {
        "name": req.body.name,
        "email": req.body.email,
        "surname": req.body.surname,
        "category": req.body.category
    };

    let success = await User.findOneAndUpdate(filter, update, { new: true });

    console.log(success);

    if (success) {
        res.json({ "status": true, "data": {} });
    } else {
        console.log("Error updating user.");
        res.json({ "status": false, "data": "Error updating user" });
    }

});

app.listen(process.env.PORT || 5000, () => {
    console.log("Listening on port");
})