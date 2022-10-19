let http = require("http");
let url = require("url");
let fs = require("fs");

http.createServer((req, res) => {
    let q = url.parse(req.url, true);
    let filename = "." + q.pathname + ".html";
    fs.readFile(filename, (err, data) => {
        if (err) {
            res.writeHead(404, { "Content-type": "text/html; charset=utf-8" });
            return res.end("404 Not Found");
        } 
        res.writeHead(200, {"Content-type": "text/html; charset=utf-8"});
        res.write(data);
        return res.end();
    });
}).listen(8000);
