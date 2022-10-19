let express = require("express");
let app = express();

let bodyParser = require("body-parser");
app.use(bodyParser.urlencoded({extended: true}));

app.use("/", express.static("files"));

let logger = (req, res, next) => {
    let url = req.url;
    let time = new Date();
    console.log(`Received request for "${url}" at \n${time}`);
    next();
}

app.use("/login", logger, (req, res) => {
    let query = req.query;
    console.log(query);

    let name = query.name;
    let surname = query.lastname;

    let length = Object.keys(query).length;

    // console.log(`The length is ${length}`);

    res.send(`This is a login page for ${name} ${surname} and the length is ${length}?`);
});

app.use("/userForm", (req, res) => {
    console.log(req.body);

    let name = req.body.name;
    let surname = req.body.surname;

    res.send(`Post variables name: ${name}, ${surname}!!!`);
    console.log(JSON.stringify(req.headers));
});

app.use("/about/:name/:surname", (req, res) => {
    let params = req.params;

    res.send(`This is an about page for ${params.name} ${params.surname}`);
});

app.use("/test", (req, res) => {
    res.send("Hello test?");
});

app.use("/", (req, res) => {
    let name = req.query.name;

    res.status(200).type("html");
    if (name) {
        res.write(`Hello ${name}!`);
    } else {
        res.write("You are a guest..");
    }

    // console.log(res.get("Content-type"));
    res.end();
});

app.listen(8000, () => {
    console.log("Listening on port 8000");
})
