let express = require("express");
let app = express();

const cors = require("cors");
app.use(cors({
    origin:"*"
}));

const fs = require("fs");

const bodyParser = require("body-parser");
app.use(bodyParser.urlencoded({ extended:true }));

app.get("/user/findAll", (req, res) => {
    console.log("Get all users");

    fs.readFile("data.json", "utf-8", (err, data) => {
        if (err)
            res.json({"statis":false, "message":err});
        else
            var json = JSON.parse(data);

        res.send(json);
    });
});

app.listen(3000, () => {
    console.log("Listening on port 3000");
});
