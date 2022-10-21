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

app.post("/user/create", (req, res) => {
    console.log("Insert User", req.body);

    const username = req.body.username;
    console.log(`Insert user with username: ${username}`);

    let newUser = new User({
        username: username,
        name: req.body.name,
        surname: req.body.surname,
        category: req.body.category,
        email: req.body.email
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

app.use("/", (req, res) => {
    console.log("Hello MongoDB");

    res.send("Hello MongoDB");
});

app.listen(3000, () => {
    console.log("Listening on port 3000");
})