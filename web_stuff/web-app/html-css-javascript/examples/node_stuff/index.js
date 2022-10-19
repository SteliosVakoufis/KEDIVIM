let express = require("express");
let app = express();

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

    console.log(res.get("Content-type"));
    res.end();
});

app.listen(8000, () => {
    console.log("Listening on port 8000");
})
