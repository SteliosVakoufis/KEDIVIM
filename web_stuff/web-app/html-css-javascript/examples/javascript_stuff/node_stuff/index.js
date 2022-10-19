let express = require("express");
let app = express();

app.use("/test", (req, res) => {
    res.send("Hello test?");
});

app.use("/", (req, res) => {
    res.send("Hello World?");
});

app.listen(8000, () => {
    console.log("Listening on port 8000");
})
